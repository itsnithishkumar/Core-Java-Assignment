package com.collectionFramwork9;

import java.util.TreeSet;

public class BankAccountList {

	public static void main(String[] args) {
		SavingAccount a1 = new SavingAccount(1999, 103, "Jerry", "Salray");
		SavingAccount a2 = new SavingAccount(1998, 101, "Tom", "Salray");
		SavingAccount a3 = new SavingAccount(1997, 101, "Thor", "Salray");
		SavingAccount a4 = new SavingAccount(1996, 104, "Hulk", "Salray");
		TreeSet<SavingAccount> n= new TreeSet<SavingAccount>(new MyComparator());

		n.add(a1);
		n.add(a2);
		n.add(a3);
		n.add(a4);

		System.out.println(n);

	}

}
