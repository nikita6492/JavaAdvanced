package com.cts.streamapi;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringDuplicate {

	public static void main(String[] args) {
		
		String str = "Hello!Hii";
		
		char[] c=str.toCharArray();
		
		//printing distinct characters
		String s =str.chars().distinct().mapToObj(c1->Character.toString((char)c1)).collect(Collectors.joining());
		System.out.println(s);
	}

}
