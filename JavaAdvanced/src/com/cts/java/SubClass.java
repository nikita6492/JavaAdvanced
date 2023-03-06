package com.cts.java;

public class SubClass extends SuperClass {

		//@Override
		public void show(String msg) {
			System.out.println("Sub class"+msg);
			super.show();
		}
		
		public static void main(String[] args) {
			SubClass s=new SubClass();
			s.show("hii");
		
			
		}
	
}
