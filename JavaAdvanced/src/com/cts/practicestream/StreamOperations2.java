package com.cts.practicestream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class StreamOperations2 {

	public static void main(String[] args) {

		// Sum of even numbers in a list
		List<Integer> list = Arrays.asList(10, 1, 0, 33, 22, 44, 11);
		Integer sum = list.stream().filter(i -> i % 2 == 0).mapToInt(i -> i).sum();
		System.out.println("Sum of even numbers in a list::");
		System.out.println(sum);
		System.out.println("==================================================================");

		// Given a list of strings, use the Stream API to create a new list that
		// contains only the strings that start with the letter 'a'.

		List<String> stringList = Arrays.asList("amit", "banana", "apple", "cherry", "zebra", "apricot");
		List<String> aList = stringList.stream().filter(i -> i.startsWith("a")).collect(Collectors.toList());
		System.out.println("create a new list that contains only the strings that start with the letter 'a'.");
		aList.forEach(System.out::println);
		System.out.println("==================================================================");
		
		// Given a list of Employee objects, use the Stream API to create a map that
		// maps the employee's name to their salary.
		Employee emp1 = new Employee(1, "John Doe", 75000, "IT",30);
		Employee emp2 = new Employee(2, "Jane Smith", 80000, "HR",25);
		Employee emp3 = new Employee(3, "Bob Johnson", 65000, "Finance",44);
		Employee emp4 = new Employee(4, "Samantha Taylor", 90000, "Marketing",38);
		Employee emp5 = new Employee(5, "Michael Brown", 75000, "IT",27);
		Employee emp6 = new Employee(6, "Jessica Davis", 80000, "HR",25);
		Employee emp7 = new Employee(7, "William Garcia", 65000, "Finance",50);
		List<Employee> empList = Arrays.asList(emp1, emp2, emp3, emp4, emp5, emp6, emp7);
		Map<String, Double> empMap = empList.stream()
				.collect(Collectors.toMap(e -> e.getEmpName(), e -> e.getEmpSal()));
		System.out.println("create a map that maps the employee's name to their salary.");
		empMap.forEach((k, v) -> System.out.println("EmpName::" + k + "-EmpSal::" + v));
		System.out.println("================================================================");
		
		// Given a list of Employee objects, use the Stream API to create a map that
		// maps the groups employee department wise
		
		Map<String, List<Employee>> empDeptMap = empList.stream().collect(Collectors.groupingBy(e->e.getDept()));
		System.out.println("create a map that maps the groups employee department wise");
		Iterator<Entry<String, List<Employee>>> itr= empDeptMap.entrySet().iterator();
		while(itr.hasNext()) {
		Map.Entry<String, List<Employee>> map= itr.next();
		System.out.print("Dept::"+map.getKey() +"--Employee::");
		map.getValue().stream().forEach(i->System.out.println(i.getEmpName()));
		System.out.println();
		}
		System.out.println("==========================================================================");

	}

}
