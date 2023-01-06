package com.cts.collections;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.TreeSet;

public class TryWithResourcesPrimeNumber {

	public static void main(String[] args) {
		//writing data to file
		try(FileOutputStream fos=new FileOutputStream("treeset.txt");
				ObjectOutputStream oos=new ObjectOutputStream(fos)){
			TreeSet<Integer> ts=new TreeSet<Integer>();
			ts.add(7);
			ts.add(3);
			ts.add(5);
			ts.add(1);
			ts.add(11);
			ts.add(9);
			ts.add(23);
			ts.add(17);
			ts.add(13);
			ts.add(19);
			oos.writeObject(ts);
			System.out.println("Message Written!!");
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//reading data from file
		TreeSet<Integer> ts1=null;
		try(FileInputStream fis =new FileInputStream("treeset.txt");
				ObjectInputStream ois=new ObjectInputStream(fis)){
			ts1=(TreeSet)ois.readObject();
			System.out.println("File read::");
			ts1.forEach(System.out::println);
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
