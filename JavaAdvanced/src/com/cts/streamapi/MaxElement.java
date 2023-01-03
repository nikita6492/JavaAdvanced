package com.cts.streamapi;

import java.util.Arrays;
import java.util.List;

public class MaxElement {

	public static void main(String[] args) {
		
		List<Integer> list =Arrays.asList(10,2,11,3,15,20,2,10,100,11);
		
		int a =list.stream().max(Integer::compare).get();
		System.out.print(a);
	}
}
