package com.cts.streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
		List<Integer> list =Arrays.asList(10,2,11,3,15,20,2,10,100,11);
		System.out.println("**Ascending Order**");
		list.stream().sorted().forEach(System.out::println);
		System.out.println("**Descending Order**");
		list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);

	}

}
