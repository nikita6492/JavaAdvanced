package com.cts.java;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

class ThreadImpl implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		Random random =new Random();
		return random.ints().limit(10).sum();
	}
	

}
class ThreadImplMain{
	public static void main(String[] args) {
		
		ThreadImpl i=new ThreadImpl();
		//FutureTask<Integer> ft = i.call();
		//Executors
		
	}
}
