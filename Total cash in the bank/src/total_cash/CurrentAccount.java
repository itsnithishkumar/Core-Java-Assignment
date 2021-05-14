package total_cash;

public class CurrentAccount extends Totalcash {
	
	double cash_credit=75000;
	@Override
	public double totalCash()
	{
		CurrentAccount c1=new CurrentAccount();
		return(c1.balance+c1.deposits+c1.transfer+c1.cash_credit);
	}

	public static void main(String[] args) {
		SavingAccount s1=new SavingAccount();
		CurrentAccount c1=new  CurrentAccount();
		System.out.println("The total cash in the bank is " + (s1.totalCash()+c1.totalCash()));

	}

}
