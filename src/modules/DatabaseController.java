package modules;

public class DatabaseController {
	public enum Databases {
		ROOMS,
		RESERVATIONS,
		CUSTOMERS,
		EQUIPMENT,
	}
	
	private static DatabaseController self = new DatabaseController();
	
	private DatabaseController() {
		
	}
	
	public static DatabaseController instance() {
		return self;
	}
	
	public void commit(Databases database) {
		//somehow hold all values in this class, perhaps
	}
	
	public void open() {
	}
	
	public void query(Databases database, String query) {
	}
	
	public boolean add(Databases database) {
		return true;
		
	}
	
	public boolean remove(Databases database, int reservation) {
		return false;
		
	}
}
