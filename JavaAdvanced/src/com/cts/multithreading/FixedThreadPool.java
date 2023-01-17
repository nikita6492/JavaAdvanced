package com.cts.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable{
	
	private int taskId;
	
	public Task(int taskId) {
		this.taskId=taskId;
	}

	@Override
	public void run() {
		System.out.println("Task with id "+taskId+ " is running on thread "+Thread.currentThread().getName());
		
	}
	
}
public class FixedThreadPool {

	public static void main(String[] args) {
		
		ExecutorService exec =Executors.newFixedThreadPool(5);
		
		for(int i=1;i<=10;i++) {
			Runnable task =new Task(i);
			exec.execute(task);
		}
		
		exec.shutdown();

	}

}
