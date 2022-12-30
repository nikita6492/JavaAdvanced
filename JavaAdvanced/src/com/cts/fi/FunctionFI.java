package com.cts.fi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionFI {

	static String convert(List<String> list) {
		return list.stream().map(s->s.toUpperCase()).collect(Collectors.joining(","));
	}
	
	public static void main(String[] args) {
		
		Function<List<String>, String> funcObj = FunctionFI::convert;
		List<String> list =Arrays.asList("apple","banana","orange","cherry");
		System.out.print(funcObj.apply(list));
	}
}
