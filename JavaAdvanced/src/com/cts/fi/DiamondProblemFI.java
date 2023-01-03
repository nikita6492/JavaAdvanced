package com.cts.fi;

interface Display{
	
	default void show(String msg) {
		System.out.println("Display Interface::"+msg);
	}
}

interface View{
	
	default void show(String msg){
		System.out.println("View Interface::"+msg);
	}
}
public class DiamondProblemFI implements Display,View {

	
	
	public void show(String msg) {
		Display.super.show(msg);
		View.super.show(msg);
	}

	public static void main(String[] args) {
		
		DiamondProblemFI dp =new DiamondProblemFI();
		dp.show("Hii");
	}
}
