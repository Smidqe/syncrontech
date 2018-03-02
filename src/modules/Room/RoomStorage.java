package modules.Room;

import java.util.HashMap;
import java.util.Map;

import modules.Interfaces.Storage;

public class RoomStorage implements Storage {
	private Map<Integer, Room> storage;
	private static RoomStorage self = new RoomStorage();
	
	private RoomStorage() {
		this.storage = new HashMap<Integer, Room>();
	}
	
	public static RoomStorage instance() {
		return self;
	}

	@Override
	public void add(Object o) {
		// TODO Auto-generated method stub
		this.storage.put(((Room) o).getId(), (Room) o);
	}

	@Override
	public Object get(int id) {
		// TODO Auto-generated method stub
		return this.storage.get(id);
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

	@Override
	public Map<Integer, ?> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
