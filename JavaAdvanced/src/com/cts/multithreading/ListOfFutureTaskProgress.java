package com.cts.multithreading;

import java.util.concurrent.*;
import java.util.ArrayList;
import java.util.List;

public class ListOfFutureTaskProgress {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// Create a fixed thread pool with 3 threads
		ExecutorService executor = Executors.newFixedThreadPool(3);

		// Create a list to store the Future objects
		List<Future<Integer>> list = new ArrayList<Future<Integer>>();

		// Submit the tasks to the executor
		for (int i = 0; i < 10; i++) {
			Future<Integer> future = executor.submit(new CallableExample(i));
			list.add(future);
		}

		// Monitor the progress of the tasks
		for (Future<Integer> fut : list) {
			while (!fut.isDone()) {
				System.out.println("Task " + fut.get() + " is not completed yet");
				Thread.sleep(1000);
			}
			System.out.println("Task " + fut.get() + " is completed");
		}

		executor.shutdown();
	}
}

class CallableExample implements Callable<Integer> {
	private int taskId;

	public CallableExample(int taskId) {
		this.taskId = taskId;
	}

	public Integer call() throws Exception {
		Thread.sleep(3000);
		return taskId;
	}
}
