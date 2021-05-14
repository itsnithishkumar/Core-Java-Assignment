package com.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Transaction {
	Trader trader;
	int year;
	int value;
	public Transaction(Trader trader, int year, int value) {
		super();
		this.trader = trader;
		this.year = year;
		this.value = value;
	}
	public Trader getTrader() {
		return trader;
	}
	public void setTrader(Trader trader) {
		this.trader = trader;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Transaction [Trader=" + trader + ", year=" + year + ", value=" + value + "]";
	}
	public static void main(String[] args) {
		List<Fruit> fru = Arrays.asList(

				new Fruit("Apple", 98, 45, "Red"), new Fruit("Banana", 102, 30, "Yellow"),
				new Fruit("Strwaberry", 120, 55, "Red"), new Fruit("Blackberry", 78, 34, "Black"));

		List<News> news1 = Arrays.asList(
				new News(22, "Mani", "Ravi", " the new budget lis is good"),
				new News(23, "Nith", "Raja", "Finally ipl Started"),
				new News(23, "Mani", "Raja", "I supported to MI "), 
				new News(24, "Ashok", "Suresh", "wbu 12 exam"),
				new News(22, "Nith", "Ramesh", "without budget list face too much problem"),
				new News(23, "Sophie", "Raja", "ipl india ka festival"));
		List<Trader> Trade = Arrays.asList(
				new Trader("Name1", "Chennai"), 
				new Trader("Sarah", "Coimabatore"), 
				new Trader("Name2", "Trichy"),
				new Trader("Ram", "Madurai"), 
				new Trader("Name3", "Salem"));
		List<Transaction> Tran = Arrays.asList(
				new Transaction(new Trader("Name1", "Chennai"), 2014, 20000),
				new Transaction(new Trader("Sarah", "Coimabatore"), 2012, 21000),
				new Transaction(new Trader("Name2", "Trichy"), 2019, 70000),
				new Transaction(new Trader("Ram", "Madurai"), 2017, 22222),
				new Transaction(new Trader("Name3", "Salem"), 2014, 19999));
		//Ques.1
		System.out.println("Acoording to <less calories ");
		fru.stream().filter(t -> (t.calories < 100)).collect(Collectors.toList())
				.forEach(t -> System.out.println(t));

		//Ques.2
		System.out.println("\nSort according to color");
		fru.stream().sorted((p1, p2) -> p1.color.compareTo(p2.color)).forEach(System.out::println);

		//Ques.3
		System.out.println("\nSort Red color fruits sorted withprice in ascending");
		fru.stream().filter(t -> t.color.equals("Red")).forEach(t -> System.out.println(t));

		//Ques.4
		System.out.println("\nnewsId which has received maximum comments");
		int p = news1.stream().min((p1, p2) -> {
			return (int) p1.getNewsId() + p2.getNewsId();
		}).get().getNewsId();
		System.out.println(p);

		//Ques.5
		System.out.println("\nthe word 'budget' arrived in user comments ");
		news1.stream().filter(t -> t.comment.contains("budget")).forEach(t -> System.out.println(t));

		//Ques.6
		System.out.println("\nwhich user has posted maximum comments");
		String n = news1.stream().max((p1, p2) -> {
			return (int) p1.getCommentByUser().compareTo(p2.getCommentByUser());
		}).get().getCommentByUser();
		System.out.println(n);

		//Ques.7
		System.out.println("\ncommentByUser wise number of comments");
		news1.stream().sorted((p1, p2) -> p1.getCommentByUser().compareTo(p2.getCommentByUser()))
				.collect(Collectors.toList())
				.forEach(t -> System.out.println(t.commentByUser + "=" + t.comment));

		//Ques.8
		System.out.println("\ntransactions in the year 2011 and sort them by value (small to high).");
		Tran.stream().filter(t -> (t.getYear() == (2014)))
				.forEach(t -> System.out.println("year=" + t.year + " value=" + t.value));

		//Ques.9
		System.out.println("\nall the unique cities where the traders work");
		Trade.stream()

				.forEach(t -> System.out.println("Cities=" + t.city));

		//Ques.10
		System.out.println("\ntraders from Pune and sort them by name");
		Trade.stream().filter(t -> t.city.equals("Pune"))
				.sorted((p1, p2) -> p1.name.compareTo(p2.name))
				.forEach(t -> System.out.println(t.city + "=" + t.name));

		//Ques.11
		System.out.println("\nstring of all traders’ names sorted alphabetically");
		Trade.stream().sorted((p1, p2) -> p1.name.compareTo(p2.name))
				.forEach(t -> System.out.println(t.name));

		//Ques.12
		System.out.println("\nany traders based in Indore?");
		boolean a = Trade.stream().anyMatch(t -> t.name.equals("indore"));
		System.out.println(a);

		//Ques.13
		System.out.println("\nall transactions’ values from the traders living in Delhi");
		Tran.stream().filter(t -> t.trader.city.equals("Delhi"))
				.forEach(t -> System.out.println(t.trader.city + "=" + t.value));

		//Ques.14
		System.out.println("\nhighest value of all the transactions");
		int b = Tran.stream().max((p1, p2) -> p1.value - p2.value).get().getValue();
		System.out.println(b);
		
		//Ques.15
		System.out.println("\ntransaction with the smallest value");
		int s = Tran.stream().min((p1, p2) -> p1.value - p2.value).get().getValue();
		System.out.println(s);	
		
	}
	

}
