package com.cts.fi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerFI {

	static void display(List<Integer> list) {
		list.stream().distinct().forEachOrdered(System.out::println);
	}
	
	public static void main(String[] args) {
		
		Consumer<List<Integer>> consObj=ConsumerFI::display;
		List<Integer> list =Arrays.asList(10,3,4,11,12,16,3);
		consObj.accept(list);
	}
}
