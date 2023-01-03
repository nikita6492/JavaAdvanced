package com.cts.collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class User{
	private String firstName;
	private String lastName;
	public User(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
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
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
}
public class ComparatorTreeset {

	public static void main(String[] args) {
		TreeSet<User> tsUser =new TreeSet<User>(Comparator.comparing(User::getLastName));
		tsUser.add(new User("John", "Willow"));
		tsUser.add(new User("Mark", "Smith"));
		tsUser.add(new User("Ram", "Gupta"));
		
		tsUser.forEach(System.out::println);
	}

}
