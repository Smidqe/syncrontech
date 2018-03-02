package modules.Interfaces;

import java.util.Map;

public interface Storage {
	void add(Object o);
	
	Object get(int id);
	Map<Integer, ?> getAll();
	void remove(int id);
	void modify(int id, Object newObj);
	
	void save();
	void load();
}
