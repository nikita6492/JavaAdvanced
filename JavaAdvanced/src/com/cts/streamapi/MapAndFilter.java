package com.cts.streamapi;

import java.util.Arrays;
import java.util.List;

public class MapAndFilter {

	public static void main(String[] args) {
		List<Integer> list =Arrays.asList(0,2,5,3,15,1,2,10,100,11);
		list.stream().map(i->i*i*i).filter(i->i>50).forEach(System.out::println);
	}

}
