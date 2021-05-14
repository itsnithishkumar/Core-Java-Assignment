package com.javaAssignment9;

import java.util.ArrayList;

public class Report {
	int i;
	int j;
	int k;
	public Report(int i, int j, int k) {
		this.i=i;
		this.j=j;
		this.k=k;
	
	}
    public static void main(String[] args) {
		
		ArrayList<Report> a1= new ArrayList<Report>();
		
		Report r1= new Report(75,70,90);
		Report r2= new Report(85,65,95);
		Report r3= new Report(90,70,55);
		
		a1.add(r1);
		a1.add(r2);
		a1.add(r3);
		
		
		System.out.println(r1.getTotalscore());
		System.out.println(r2.getTotalscore());
		System.out.println(r3.getTotalscore());
		System.out.println(r1.getAverage());
		System.out.println(r2.getAverage());
		System.out.println(r3.getAverage());

	}
	private int getAverage() {
		
		return((i+j+k)/3);
		
		
	}
	private int getTotalscore() {
		return(i+j+k);
		
	}
	

}
