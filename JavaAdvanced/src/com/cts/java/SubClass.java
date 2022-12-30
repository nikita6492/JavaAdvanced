package com.cts.java;

public class SubClass extends SuperClass {

		@Override
		public void show() {
			System.out.println("Sub class");
			super.show();
		}
		
		public static void main(String[] args) {
			SubClass s=new SubClass();
			s.show();
		
			
		}
	
}
