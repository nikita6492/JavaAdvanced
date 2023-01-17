package com.cts.java;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

class ThreadImplMain implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		Random random =new Random();
		Thread.sleep(10000);
		return random.ints().limit(10).sum();
	}
	

}
class ThreadImpl{
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService service =Executors.newFixedThreadPool(2);
		Future<Integer> value = service.submit(new ThreadImplMain());
		System.out.println("Start");
		Integer integer = value.get();
		System.out.println("Now printing");
		System.out.println(integer);
		System.out.println("End");
		service.shutdown();
		
	}
}
