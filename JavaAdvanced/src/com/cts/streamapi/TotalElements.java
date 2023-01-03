package com.cts.streamapi;

import java.util.Arrays;
import java.util.List;

public class TotalElements {

	public static void main(String[] args) {
		List<Integer> list =Arrays.asList(10,2,11,3,15,20,2,10,100,11);
		long count = list.stream().count();
		System.out.print(count);
	}

}
