package com.lambda3;

import java.util.function.Supplier;

public class SupplierJava {

	public static void main(String[] args) {
		Supplier<String> supplier= ()-> "Abc";
		  System.out.println(supplier.get());

	}

}
