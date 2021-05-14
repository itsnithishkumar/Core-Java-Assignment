package com.collectionFramwork9;

public class SavingAccount {
	int acc_balance;
	int acc_ID;
	String accountHoldername;
	String isSalaryAccount;
	public SavingAccount(int acc_balance, int acc_ID, String accountHoldername, String isSalaryAccount) {
		this.acc_balance = acc_balance;
		this.acc_ID = acc_ID;
		this.accountHoldername = accountHoldername;
		this.isSalaryAccount = isSalaryAccount;
	}
	public int getAcc_balance() {
		return acc_balance;
	}
	public void setAcc_balance(int acc_balance) {
		this.acc_balance = acc_balance;
	}
	public int getAcc_ID() {
		return acc_ID;
	}
	public void setAcc_ID(int acc_ID) {
		this.acc_ID = acc_ID;
	}
	public String getAccountHoldername() {
		return accountHoldername;
	}
	public void setAccountHoldername(String accountHoldername) {
		this.accountHoldername = accountHoldername;
	}
	public String getIsSalaryAccount() {
		return isSalaryAccount;
	}
	public void setIsSalaryAccount(String isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}
	@Override
	public String toString() {
		return "Account [ID=" + acc_ID + ", Balance=" + acc_balance + ", Name=" + accountHoldername + ", Salary=" + isSalaryAccount + "]";
	}

	void WithDraw() {

	}

	void Deposit() {

	}
	

}
