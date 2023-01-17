package com.cts.multithreading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class AddElement implements Runnable {

	private List<Integer> list;

	public AddElement(List<Integer> list) {

		this.list = list;
	}

	@Override
	public void run() {
		System.out.println("Inside AddElement"+Thread.currentThread().getName());
		for (int i = 0; i <= 100; i++) {
			synchronized (list) {
				System.out.println("adding "+i);
				list.add(i);
			}
		}

	}

}

class RemoveElement implements Runnable {

	private List<Integer> list;

	public RemoveElement(List<Integer> list) {

		this.list = list;
	}

	@Override
	public void run() {
		System.out.println("Inside Remove Element"+Thread.currentThread().getName());
		for (int i = 0; i <= 100; i++) {
			synchronized (list) {
				while (!list.isEmpty()) {
					System.out.println("Removing "+list.get(0));
					list.remove(0);
				}
			}
		}

	}

}

public class SynchronizedArrayList {

	public static void main(String[] args) throws InterruptedException {
		List<Integer> list = Collections.synchronizedList(new ArrayList<Integer>());

		Thread addThread = new Thread(new AddElement(list));
		Thread removeThread = new Thread(new RemoveElement(list));
		addThread.start();
		removeThread.start();

		addThread.join();
		removeThread.join();
		
		list.forEach(System.out::println);
	}

}
