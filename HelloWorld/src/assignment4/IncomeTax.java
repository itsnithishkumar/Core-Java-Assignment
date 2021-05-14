package assignment4;

import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double salary=sc.nextDouble();
		if (salary>= 0 && salary<=180000)
		{
			System.out.println("Nil Tax");
		}
		else if(salary >=181001 && salary <=300000)
		{
			System.out.println((float)(10/100)*salary);
		}
		else if(salary>=300001 && salary<=500000)
		{
			System.out.println(0.2*salary);
		}
		else if(salary>=500001 && salary<=1000000)
		{
			System.out.println(0.3*salary);
		}
		sc.close();
	}

}
