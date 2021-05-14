package com.lambda1;

import java.util.*;

public class Arithmetic_operations {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Number 1");
	int a = sc.nextInt();
	System.out.println("Number2");
	int b = sc.nextInt();

	Sum add = (c, d) -> c + d;
    System.out.println("add=" + add.operation(a, b));
    
    Sum sub = (c, d) -> c - d;
	System.out.println("sub=" + sub.operation(a, b));

	Sum mul = (c, d) -> c * d;
	System.out.println("mul=" + mul.operation(a, b));

	Sum div = (c, d) -> c / d;
	System.out.println("div=" + div.operation(a, b));
	sc.close();

	
	

}

}

interface Sum {
int operation(int a, int b);

}
