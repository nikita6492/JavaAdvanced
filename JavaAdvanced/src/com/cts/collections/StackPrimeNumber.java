package com.cts.collections;

import java.util.Iterator;
import java.util.Stack;

public class StackPrimeNumber {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		stack.push(3);
		stack.push(1);
		stack.push(5);
		stack.pop();
		stack.push(7);
		//System.out.println(stack.push(11));
		//System.out.println(stack.add(23));
		stack.push(11);
		stack.pop();
		
		stack.forEach(System.out::println);

	}

}
