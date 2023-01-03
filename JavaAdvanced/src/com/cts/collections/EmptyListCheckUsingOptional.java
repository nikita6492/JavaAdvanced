package com.cts.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class EmptyListCheckUsingOptional {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,20,30,22,1,8);
		Optional.ofNullable(list).orElseGet(Collections::emptyList).stream().filter(Objects::nonNull)
		.forEach(System.out::println);
		
		List<Integer> list1 =new ArrayList<Integer>();
		Optional.ofNullable(list1).orElseGet(Collections::emptyList).stream().filter(Objects::nonNull)
		.forEach(System.out::println);
	}

}
