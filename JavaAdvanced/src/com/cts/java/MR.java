package com.cts.java;


public class MR {
	
	public String display() {
		return "Hello1";
	}
	
	public static void main(String[] args) {
		MR m=new MR();
		Abc a =m::display;
		Abc x=Abc::display2;
		Abc y = m::display;
		System.out.println(a.show());
		System.out.println(x.show());
		System.out.println(y.view());
	}

}
