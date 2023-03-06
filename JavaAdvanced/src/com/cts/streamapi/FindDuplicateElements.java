package com.cts.streamapi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElements {

	public static void main(String[] args) {
		
		List<Integer> list =Arrays.asList(10,2,11,3,15,20,2,10,100,11);
		Set<Integer> set=new HashSet<Integer>();
		list.stream().filter(i->!set.add(i)).forEach(System.out::println);
		
		//printing duplicates
		String s ="Hello!!Hii";
		Set<Character> charset =new HashSet<Character>();
		String str =s.chars().filter(i->!charset.add((char) i)).mapToObj(c1->Character.toString((char)c1)).collect(Collectors.joining());
		System.out.println(str);
	}
}

