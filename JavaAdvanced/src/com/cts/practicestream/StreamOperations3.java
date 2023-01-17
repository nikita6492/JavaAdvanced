package com.cts.practicestream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class StreamOperations3 {

	public static void main(String[] args) {
		
		//Given a list of integers, use the Stream API to find the first number that is greater than 20.
		List<Integer> list =Arrays.asList(1,10,21,44,2);
		Optional<Integer> num = list.stream().filter(i->i>20).findFirst();
		System.out.println("use the Stream API to find the first number that is greater than 20.");
		System.out.println(num.get());
		System.out.println("=================================================================");
		
		//Given a list of Employee objects, use the Stream API to sort the employees by their age in descending order.
		
		Employee emp1 = new Employee(1, "John Doe", 75000, "IT",30);
		Employee emp2 = new Employee(2, "Jane Smith", 80000, "HR",25);
		Employee emp3 = new Employee(3, "Bob Johnson", 65000, "Finance",44);
		Employee emp4 = new Employee(4, "Samantha Taylor", 90000, "Marketing",38);
		Employee emp5 = new Employee(5, "Michael Brown", 75000, "IT",27);
		Employee emp6 = new Employee(6, "Jessica Davis", 80000, "HR",25);
		Employee emp7 = new Employee(7, "William Garcia", 65000, "Finance",50);
		List<Employee> empList = Arrays.asList(emp1, emp2, emp3, emp4, emp5, emp6, emp7);
		
		List<Employee> e=empList.stream().sorted(Comparator.comparing(Employee::getAge).reversed()).collect(Collectors.toList());
		System.out.println(" use the Stream API to sort the employees by their age in descending order.");
		e.forEach(i->System.out.println(i.getEmpName()+"::"+i.getAge()));
		System.out.println("============================================================");
		
		//Given a list of integers, use the Stream API to find the product of all the numbers in the list.
		System.out.println("use the Stream API to find the product of all the numbers in the list");
		Integer product =list.stream().mapToInt(Integer::intValue).reduce(1, (a,b)->a*b);
		System.out.println(product);
		System.out.println("=====================================================================");
		
		//Given a list of strings, use the Stream API to find the longest string in the list.
		List<String> strList = Arrays.asList("apple","banana","cherry","himalaya");
		String longest = strList.stream().reduce("", (a,b)->a.length()>b.length()?a:b);
		Optional<String> longest2 = strList.stream().max(Comparator.comparing(String::length));
		System.out.println("Given a list of strings, use the Stream API to find the longest string in the list.");
		System.out.println(longest);
		System.out.println(longest2.get());
		System.out.println("===================================================================");
		
		//Given a list of integers, use the Stream API to find the average of all the numbers in the list.
		
		System.out.println("use the Stream API to find the average of all the numbers in the list.");
		OptionalDouble avg = list.stream().mapToInt(Integer::intValue).average();
		System.out.println(avg.getAsDouble());
		System.out.println("====================================================================");
		
		//Given a list of Employee objects, use the Stream API to find the employee with the highest salary.
		System.out.println("use the Stream API to find the employee with the highest salary.");
		Optional<Employee> emp =empList.stream().max(Comparator.comparing(Employee::getEmpSal));
		System.out.println(emp.get().getEmpName()+"::"+emp.get().getEmpSal());
		System.out.println("====================================================================");
	}

}
