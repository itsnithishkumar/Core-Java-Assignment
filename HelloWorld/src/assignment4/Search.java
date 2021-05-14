package assignment4;

import java.util.*;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int array[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int x=sc.nextInt();
		int flag=0;
		for(int i=0; i<array.length; i++)
		{
			if(array[i]==x)
			{
				System.out.println("found");
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("not found");
		}
		
		sc.close();

	}

}
