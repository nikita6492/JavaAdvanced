package com.cts.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class Test2 {

	public static void main(String[] args) {
		List<Employee> empList =new ArrayList<Employee>();
		empList.add(new Employee(1, "John"));
		empList.add(new Employee(2, "Mark"));
		empList.add(new Employee(3, "Smith"));
		empList.add(new Employee(1, "Robert"));
	
		//HashMap<Integer, List<Employee>> m = empList.stream().map(k->m.put(k.ge, value) )
		
		// emp - id, name, deptId dept - dept id 
	}

}
