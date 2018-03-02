package modules.Equipment;

import java.util.Map;
import modules.Interfaces.Storage;

public class EquipmentStorage implements Storage {

	private static EquipmentStorage self = new EquipmentStorage();

	
	@Override
	public void add(Object o) {
		// TODO Auto-generated method stub
		
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

	@Override
	public Map<Integer, ?> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public static EquipmentStorage instance() {
		// TODO Auto-generated method stub
		return self;
	}

}
