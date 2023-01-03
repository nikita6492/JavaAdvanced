package com.cts.collections;

import java.util.PriorityQueue;

public class PriorityQueueImpl {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		pq.add(10);
		pq.add(5);
		pq.add(11);
		pq.add(33);
		pq.add(12);
		
		System.out.println("Priority Queue::");
		pq.forEach(System.out::println);

		System.out.println(pq.peek());
		pq.remove(11);
		
		System.out.println(pq.poll());
		
		System.out.println("After Operations::");
		pq.forEach(System.out::println);
		
		
	}

}
