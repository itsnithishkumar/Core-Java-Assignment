package total_cash;

public class SavingAccount extends Totalcash {
	
	double fixedDeposits=200000;
	@Override
	public double totalCash()
	{
		SavingAccount s1=new SavingAccount();
		return(s1.balance+s1.deposits+s1.transfer+s1.fixedDeposits);
	}

}
