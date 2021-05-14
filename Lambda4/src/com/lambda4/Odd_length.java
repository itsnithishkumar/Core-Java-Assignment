package com.lambda4;

import java.util.ArrayList;

public class Odd_length {

	public static void main(String[] args) {
		ArrayList<String>n=new ArrayList<String>();
		
		n.add("Abcde");
		n.add("Klmn");
		n.add("Jerry");
		n.add("Javaprog");
		n.add("computers");
		
		System.out.println(n);
		
		n.removeIf(t->(t.length()%2==1));
		System.out.println(n);

	}

}
