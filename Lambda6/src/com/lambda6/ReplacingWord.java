package com.lambda6;

import java.util.ArrayList;

public class ReplacingWord {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<>();

		a1.add("Java");
		a1.add("Computers");
		a1.add("Program");
		a1.add("Type");
		a1.add("Debug");
		a1.replaceAll(a2 -> a2.toUpperCase());

		System.out.println(a1);

	}

}
