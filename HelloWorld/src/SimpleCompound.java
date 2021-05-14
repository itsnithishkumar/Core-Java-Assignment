import java.util.Scanner;
public class SimpleCompound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

	    // take input from users
	    System.out.print("Enter the principal: ");
	    double principal = input.nextDouble();

	    System.out.print("Enter the rate: ");
	    double rate = input.nextDouble();

	    System.out.print("Enter the time: ");
	    double time = input.nextDouble();
	    
	    System.out.print("Enter number of times interest is compounded: ");
	    int number = input.nextInt();

	    double simpleinterest = (principal * time * rate) / 100;
	    System.out.println("Simple Interest: " + simpleinterest);
	    double compoundinterest = principal * (Math.pow((1 + rate/100), (time * number))) - principal;
	    System.out.println("Compound Interest: " + compoundinterest);

	    input.close();

	}

}
