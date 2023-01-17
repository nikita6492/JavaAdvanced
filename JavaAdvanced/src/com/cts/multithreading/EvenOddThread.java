package com.cts.multithreading;
class EvenThread implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=10;i+=2) {
			System.out.println("Even::"+i);
		}
		
	}
	
}

class OddThread implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=10;i+=2) {
			System.out.println("Odd::"+i);
		}
		
		
	}
	
}
public class EvenOddThread {

	public static void main(String[] args) {
		Thread evenThread = new Thread(new EvenThread());
		Thread oddThread = new Thread(new OddThread());
		evenThread.start();
		oddThread.start();

	}

}
