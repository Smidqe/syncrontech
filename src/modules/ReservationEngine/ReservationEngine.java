package modules.ReservationEngine;

import java.util.Map;
import java.util.Map.Entry;

import modules.DatabaseController;
import modules.DatabaseController.Databases;
import modules.Customer.Customer;
import modules.Customer.CustomerStorage;
import modules.Equipment.EquipmentStorage;
import modules.Reservation.Reservation;
import modules.Reservation.ReservationStorage;
import modules.Room.Room;
import modules.Room.RoomStorage;

@SuppressWarnings("unused")
public class ReservationEngine {
	private static ReservationEngine self = new ReservationEngine();
	private CustomerStorage customers;
	private EquipmentStorage equipment;
	private ReservationStorage reservations;
	private RoomStorage rooms;
	private DatabaseController database;
	
	private int currentMaxID;
	
	private enum Values {
		SUCCESS,
		ERROR_OVERLAP,
		ERROR_NOT_EXISTS,
		ERROR_DATABASE_SAVE,
		ERROR_DATABASE_LOAD, 
		ERROR_CUSTOMER_NOT_EXIST, 
		ERROR_ROOM_NOT_EXIST,
	}
	
	ReservationEngine() {
		this.database = DatabaseController.instance(); //could use a path here
		this.database.open();
		
		this.customers = CustomerStorage.instance();
		this.equipment = EquipmentStorage.instance();
		this.reservations = ReservationStorage.instance();
		this.rooms = RoomStorage.instance();
		
		/*
		this.customers = new CustomerStorage(database.load(Databases.CUSTOMERS));
		this.equipment = new EquipmentStoragedatabase.load(Databases.EQUIPMENT));
		this.reservations = new ReservationStorage(database.load(Databases.RESERVATIONS));
		this.rooms = new RoomStorage(database.load(Databases.ROOMS));
		 */
		
		//this is for testing only
		Customer customer = new Customer();
		
		customer.setId(1);
		customer.setFirstName("Bob");
		customer.setLastName("Ross");
		
		this.customers.add(customer);
		
		Room room = new Room();
		
		room.setId(1);
		
		this.rooms.add(room);
		
		System.out.println(this.reservations);
		
		try {
			Reservation res = new Reservation(this.getNextID(), 1, 1);
			
			res.setStartTime(0);
			res.setEndTime(10);
			
			
			this.reservations.add(res);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		try {
			System.out.println(this.reserve(1, 1, 5, 15));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static ReservationEngine instance() {
		return self;
	}
	
	public boolean overlap(Reservation cmp) {
		Map<Integer, ?> values = this.reservations.getAll();
		Reservation res = null;
		
		for (Entry<Integer, ?> entry : values.entrySet())
		{
			res = (Reservation) entry.getValue();
			
			//only compare to those values where the room id's are same
			if (res.getRoom() != cmp.getRoom())
				continue;
			
			//check if the times overlap
			if (res.overlap(cmp))
				return true;
		}
		
		return false;
	}
	
	public int getNextID() throws Exception {
		if (this.currentMaxID == Integer.MAX_VALUE)
			throw new Exception("Integer at MAX_VALUE, won't continue");
		
		this.currentMaxID += 1;
		
		return this.currentMaxID;
	}
	
	public Values reserve(int customer, int room, long startTime, long endTime) throws Exception {
		if (this.customers.get(customer) == null)
			return Values.ERROR_CUSTOMER_NOT_EXIST;
		
		if (this.rooms.get(room) == null)
			return Values.ERROR_ROOM_NOT_EXIST;
		
		Reservation result = new Reservation(this.getNextID(), customer, room); 
		
		result.setStartTime(startTime);
		result.setEndTime(endTime);
		
		if (this.overlap(result))
			return Values.ERROR_OVERLAP;
		
		if (!this.database.add(null))
			return Values.ERROR_DATABASE_SAVE;
		
		return Values.SUCCESS;
	}
	
	public Values remove(int reservation) {
		this.database.remove(Databases.RESERVATIONS, reservation);
		
		return Values.SUCCESS;
	}
}
