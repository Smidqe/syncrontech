package modules.Room;

import java.util.ArrayList;
import java.util.List;

import modules.Equipment.Equipment;

public class Room {
	private int id;
	private Equipment equipment;
	private List<Integer> reservations;
	private String name;
	private String location;
	
	public Room() {
		this.reservations = new ArrayList<Integer>();
	}
	
	public Equipment getEquipment() {
		return equipment;
	}
	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}
	public List<Integer> getReservations() {
		return reservations;
	}
	public void setReservations(List<Integer> reservations) {
		this.reservations = reservations;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
