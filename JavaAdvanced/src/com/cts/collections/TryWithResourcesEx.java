package com.cts.collections;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TryWithResourcesEx {

	public static void main(String[] args) {
		//writing a file
		try(FileOutputStream fos=new FileOutputStream("abc.txt")) {
			String msg="Hello!!";
			byte byteArray[]=msg.getBytes();
			fos.write(byteArray);
			System.out.println("Message written !!");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Finally Called");
		}

		//reading a file
		try(FileInputStream fis=new FileInputStream("abc.txt")){
			
			DataInputStream dis=new DataInputStream(fis);
			int data=fis.available();
			byte[] byteArray2=new byte[data]; 
			dis.read(byteArray2);
			String msg=new String(byteArray2);
			System.out.println("msg::"+msg);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Finally Called");
		}
	}

}
