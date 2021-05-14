package com.lambda5;

import java.util.Arrays;

public class StringCreation {

	public static void main(String[] args) {
        StringBuilder s1=new StringBuilder();
		
		Arrays.asList("Java","Computers","Program","Typing")
		.forEach(n->s1.append(n.charAt(0)));
		
		System.out.println(s1);
	}

}
