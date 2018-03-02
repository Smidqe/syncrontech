package modules.Reservation;

public class Reservation {
	private int id;
	private int room;
	private long startTime;
	private long endTime;
	private int reserver; //will hold reserver id

	public Reservation(int id, int room) {
		this.id = id;
		this.room = room;
	}
	
	public Reservation(int id) {
		// TODO Auto-generated constructor stub
	}

	public Reservation(int id, int customer, int room) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.reserver = customer;
		this.room = room;
	}

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getReserver() {
		return reserver;
	}

	public void setReserver(int reserver) {
		this.reserver = reserver;
	}

	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}

	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}

	public int getRoom() {
		return this.room;
	}
	
	public void setRoom(int place) {
		this.room = place;
	}
	
	public boolean overlap(Reservation res) {
		System.out.println(res.getStartTime());
		System.out.println(res.getEndTime());

		if (this.getStartTime() < res.getEndTime())
			return true;
		
		if (this.getEndTime() > res.getStartTime())
			return true;
		
		return false;
	}

	public long getStartTime() {
		// TODO Auto-generated method stub
		return this.startTime;
	}
	
	public long getEndTime() {
		return this.endTime;
	}
}
