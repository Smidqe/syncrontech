package modules.Reservation;

import java.util.HashMap;
import java.util.Map;

import modules.Interfaces.Storage;

public class ReservationStorage implements Storage {
	Map<Integer, Reservation> reservations;
	
	private static ReservationStorage self = new ReservationStorage();
	
	private ReservationStorage() {
		this.reservations = new HashMap<Integer, Reservation>();
	}

	@Override
	public void add(Object o) {
		// TODO Auto-generated method stub
		this.reservations.put(((Reservation) o).getId(), (Reservation) o);
	}

	@Override
	public Object get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modify(int id, Object newObj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void load() {
		// TODO Auto-generated method stub
		
	}

	public Map<Integer, Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(Map<Integer, Reservation> reservations) {
		this.reservations = reservations;
	}

	@Override
	public Map<Integer, ?> getAll() {
		// TODO Auto-generated method stub
		return this.reservations;
	}

	public static ReservationStorage instance() {
		// TODO Auto-generated method stub
		return self;
	}
	
}
