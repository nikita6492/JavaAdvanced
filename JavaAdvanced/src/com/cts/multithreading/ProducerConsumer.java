package com.cts.multithreading;

import java.util.Vector;

class Producer implements Runnable{
	
	private final Vector<Integer> sharedVector;
	private final int size;
	

	public Producer(Vector<Integer> sharedVector, int size) {
		this.sharedVector = sharedVector;
		this.size = size;
	}


	@Override
	public void run() {
		for(int i=1;i<=7;i++) {
			System.out.println("Produced::"+i);
			produce(i);
		}
		
	}


	private void produce(int i) {
		while(sharedVector.size()==this.size) {
			synchronized(sharedVector) {
				try {
					sharedVector.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		synchronized (sharedVector) {
			sharedVector.add(i);
			sharedVector.notifyAll();
		}
		
	}
	
}

class Consumer implements Runnable{
	
	private final Vector<Integer> sharedVector;
	private final int size;
	

	public Consumer(Vector<Integer> sharedVector, int size) {
		this.sharedVector = sharedVector;
		this.size = size;
	}


	@Override
	public void run()  {
		while(true) {
			//Thread.sleep(50);
			System.out.println("Consumed ::"+consume());
			
		}
		
	}


	private int consume() {
		while(sharedVector.isEmpty()) {
			synchronized (sharedVector) {
				try {
					sharedVector.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		synchronized (sharedVector) {
			sharedVector.notifyAll();
			return sharedVector.remove(0);
		}
		
	}
	
}
public class ProducerConsumer {

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<Integer>();
		int size =5;
		
		Thread prod =new Thread(new Producer(vector, size));
		Thread cons =new Thread(new Consumer(vector, size));
		
		prod.start();
		cons.start();

	}

}
