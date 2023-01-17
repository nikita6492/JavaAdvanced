package com.cts.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		int sum =0;
		for(int i=0;i<=100;i++) {
			sum=sum+i;
		}
		Thread.sleep(2000);
		return sum;
	}
	
}

public class UsingCallableAndFuture {

	public static void main(String[] args) {
		ExecutorService exec=Executors.newSingleThreadExecutor();
		
		 Future<Integer> future = exec.submit(new CallableTask());

	        // Do some other work
	        System.out.println("Doing some other work...");

	        // Retrieve the result of the callable task
	        try {
	            int result = future.get();
	            System.out.println("The result is: " + result);
	        } catch (InterruptedException | ExecutionException e) {
	            e.printStackTrace();
	        }

	        exec.shutdown();



	}

}
