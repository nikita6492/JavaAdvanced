package com.cts.collections;


import java.util.Iterator;
import java.util.TreeSet;

public class SortPrimeNumbers {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(7);
		ts.add(3);
		ts.add(5);
		ts.add(1);
		ts.add(11);
		ts.add(9);
		ts.add(23);
		ts.add(17);
		ts.add(13);
		ts.add(19);
		
		
		ts.forEach(System.out::println);

	}

}
