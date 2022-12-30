package com.cts.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		List<Integer> list =Arrays.asList(10,2,11,3,15,20,2,10,100,11);
		list.stream().collect(Collectors.toSet()).forEach(System.out::println);

	}

}
