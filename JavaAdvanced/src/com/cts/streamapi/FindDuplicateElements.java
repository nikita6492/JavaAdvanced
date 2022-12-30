package com.cts.streamapi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateElements {

	public static void main(String[] args) {
		
		List<Integer> list =Arrays.asList(10,2,11,3,15,20,2,10,100,11);
		Set<Integer> set=new HashSet<Integer>();
		list.stream().filter(i->!set.add(i)).forEach(System.out::println);
	}
}

