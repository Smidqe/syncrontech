package modules.Customer;

import java.util.List;
import java.util.Map;

import modules.Reservation.Reservation;

public class Customer {
	private int id;
	private String firstName;
	private String lastName;
	private List<Integer> reservations;
	
	public Customer() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Integer> getReservations() {
		return reservations;
	}

	public void setReservations(List<Integer> reservations) {
		this.reservations = reservations;
	}
	
}
