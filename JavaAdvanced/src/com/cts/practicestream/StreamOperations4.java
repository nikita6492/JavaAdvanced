package com.cts.practicestream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class StreamOperations4 {

	public static void main(String[] args) {

		// Given a list of integers, use the Stream API to find the minimum number in
		// the list.
		List<Integer> list = Arrays.asList(10, 3, 66, 2, 778, 100);
		OptionalInt min = list.stream().mapToInt(Integer::intValue).min();
		System.out.println("use the Stream API to find the minimum number in the list.");
		System.out.println(min.getAsInt());
		System.out.println("===================================================================");

		// Given a list of words, use the Stream API to create a new list that contains
		// only the words that have more than 3 letters.

		List<String> strList = Arrays.asList("hi", "banana", "min", "himalaya");
		List<String> strList2 = strList.stream().filter(i -> i.length() > 3).collect(Collectors.toList());
		System.out.println("Strings having length greater than 3");
		strList2.forEach(System.out::println);
		System.out.println("===========================================================");

		// use the Stream API to find the person with the youngest age.
		Employee emp1 = new Employee(1, "John Doe", 75000, "IT", 30);
		Employee emp2 = new Employee(2, "Jane Smith", 80000, "HR", 25);
		Employee emp3 = new Employee(3, "Bob Johnson", 65000, "Finance", 44);
		Employee emp4 = new Employee(4, "Samantha Taylor", 90000, "Marketing", 38);
		Employee emp5 = new Employee(5, "Michael Brown", 75000, "IT", 27);
		Employee emp6 = new Employee(6, "Jessica Davis", 80000, "HR", 25);
		Employee emp7 = new Employee(7, "William Garcia", 65000, "Finance", 50);
		List<Employee> empList = Arrays.asList(emp1, emp2, emp3, emp4, emp5, emp6, emp7);

		List<Employee> eList = empList.stream().sorted(Comparator.comparing(Employee::getAge)).limit(1)
				.collect(Collectors.toList());
		System.out.println("use the Stream API to find the person with the youngest age.");
		eList.forEach(e -> System.out.println(e.getEmpName()));
		System.out.println("===============================================================");

		// Given a list of integers, use the Stream API to create a new list that
		// contains only the unique numbers.
		List<Integer> dupList = Arrays.asList(10, 1, 3, 3, 4, 1, 1, 2);
		List<Integer> unList = dupList.stream().distinct().collect(Collectors.toList());
		System.out.println("use the Stream API to create a new list that contains only the unique numbers.");
		unList.forEach(System.out::println);
		System.out.println("=====================================================================");

		// Given a list of Employee objects, use the Stream API to find the total number
		// of employees in each department.

		Map<String, Long> deptMap = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));
		System.out.println("use the Stream API to find the total number of employees in each department.");
		deptMap.forEach((k, v) -> System.out.println("Dept::" + k + "--" + v));
		System.out.println("=====================================================================");

		// Given a list of integers, use the Stream API to find the second largest
		// number in the list.
		Integer secMax = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println("Second largest element");
		System.out.println(secMax);
		System.out.println("=====================================================================");

		// use the Stream API to find the average salary of the employees in each
		// department.
		System.out.println("use the Stream API to find the average salary of the employees in each department.");
		Map<String, Double> avgSalMap = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDept, Collectors.averagingDouble(Employee::getEmpSal)));
		avgSalMap.forEach((k, v) -> System.out.println("Dept::" + k + "--" + v));
		System.out.println("=====================================================================");
	}

}
