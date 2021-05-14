package com.collectionframework7;

import java.util.TreeMap;

public class Parked_CarOwnerList {
	static  Parked_CarOwner_Details p1 = new Parked_CarOwner_Details("Raja", "Buildozer", 1807, "9874561230","20/7 Guardian of galaxy");
	static Parked_CarOwner_Details p2 = new Parked_CarOwner_Details("Ram", "Bike", 1998, "9784561230","7g Disney World");
	static Parked_CarOwner_Details p3 = new Parked_CarOwner_Details("Ramesh", "Cycle", 0211, "9871234560","8g Disney World");
	static Parked_CarOwner_Details p4 = new Parked_CarOwner_Details("Suresh", "Audi", 0311, "9654123780","20/A Guardian of galaxy");

	static TreeMap<Integer, Parked_CarOwner_Details> p = new TreeMap<>();
	static int add_new_car(Parked_CarOwner_Details obj) {

		p.put(100, p1);
		p.put(102, p2);
		p.put(103, p3);
		p.put(104, p4);

		System.out.println(p);
		return 0;

	}

	public static Object remove_car(int i) {

		p.remove(i);
		System.out.println(p);
		return p;

	}

	public static Object get_parked_location(int token) {

		System.out.println(p.get(token));
		return p.get(token);
	}

	public static void main(String[] args) {
		
		add_new_car(p1);
		remove_car(102);
		get_parked_location(104);		

	}

}
