package com.cts.streamapi;

import java.util.Arrays;
import java.util.List;

public class AllNumbersStartingWith1 {
	
	public static void main(String[] args) {
		
		List<Integer> list =Arrays.asList(10,2,11,3,15,20);
		list.stream().map(i->i+"").filter(i->i.startsWith("1")).forEach(System.out::println);
	}

}
