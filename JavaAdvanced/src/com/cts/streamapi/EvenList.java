package com.cts.streamapi;

import java.util.Arrays;
import java.util.List;

public class EvenList {

	public static void main(String[] args) {
		List<Integer> list =Arrays.asList(10,3,4,11,12,16,3);
		list.stream().filter(i->i%2==0).forEach(System.out::println);
	}
}
