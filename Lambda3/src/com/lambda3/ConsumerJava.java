package com.lambda3;

import java.util.function.Consumer;

public class ConsumerJava {

	public static void main(String[] args) {
		 
		 Consumer<String> firstC = x -> System.out.println(x.toLowerCase());
	     Consumer<String> secondC = y -> System.out.println(y.toUpperCase());
	 
	     Consumer<String> result = firstC.andThen(secondC);
	 
	    result.accept("Abc");

	}

}
