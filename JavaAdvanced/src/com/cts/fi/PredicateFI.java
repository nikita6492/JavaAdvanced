package com.cts.fi;

import java.util.function.Predicate;


public class PredicateFI {
	
	static Boolean compareAge(int age) {
		return age>18?true:false;
	}
 public static void main(String[] args) {
	
	 Predicate<Integer> predObj = PredicateFI::compareAge;
	 System.out.print(predObj.test(20));
	 
}
}
