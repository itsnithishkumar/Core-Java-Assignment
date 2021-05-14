package com.lambda8;

import java.util.ArrayList;

public class Printing_numbers {

	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(4);
		a1.add(43);
		a1.add(16);
		a1.add(50);
		a1.add(90);
		a1.add(30);
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				
				a1.stream().forEach(a1 -> System.out.println(a1));
			}
		});
		t.run();

	}

}
