package com.cts.java;

@FunctionalInterface
public interface Abc {

	String show();
	 default String view() {
		return "Hello";
	}
	 static String display2() {
		 return "Hii";
	 }
}
