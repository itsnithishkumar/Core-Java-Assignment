package assignment4;

import java.util.Scanner;

public class CUI_Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int flag=0;
		for (int i=0; i<3; i++)
		{
			System.out.println("Enter the user ID: ");
			String user=sc.next();
			System.out.println("Enter the password: ");
			String pw=sc.next();
			if(user.equals("nithish") && pw.equals("laptop"))
			{
				System.out.println("Welcome");
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Contact Admin");
		}
		
		sc.close();

	}

}
