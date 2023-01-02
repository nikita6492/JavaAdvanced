package com.cts.fi;

import java.util.function.Supplier;

public class SupplierFI {

	public static void main(String[] args) {
		
		Supplier<Double> random = ()->Math.random();
		System.out.println(random.get());
	}
}
