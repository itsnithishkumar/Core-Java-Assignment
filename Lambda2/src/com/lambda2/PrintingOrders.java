package com.lambda2;

import java.util.*;

public class PrintingOrders {

	public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
		System.out.println("Enter Amount");
		int price=a.nextInt();
		if(price>10000)
		{
		 System.out.println("Accepted");
		}
		else
		{
			System.out.println("denied");
			}
		a.close();

	}

}
