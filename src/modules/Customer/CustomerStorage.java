package modules.Customer;

import java.util.HashMap;
import java.util.Map;

import modules.Interfaces.Storage;

public class CustomerStorage implements Storage {
	private Map<Integer, Customer> storage;
	
	private static CustomerStorage self = new CustomerStorage();
	
	CustomerStorage() {
		this.storage = new HashMap<Integer, Customer>();
	}
	
	@Override
	public void add(Object o) {
		// TODO Auto-generated method stub
		this.storage.put(((Customer) o).getId(), (Customer) o);
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
		return this.storage;
	}

	public static CustomerStorage instance() {
		// TODO Auto-generated method stub
		return self;
	}

}
