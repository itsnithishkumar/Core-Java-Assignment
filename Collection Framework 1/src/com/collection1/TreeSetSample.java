package com.collection1;

import java.util.TreeSet;

public class TreeSetSample{

	public static void main(String[] args) {
		
		TreeSet<Person> t1=new TreeSet<Person>();
		Person p1= new Person(85,175,"Abc");
		Person p2= new Person(80,177,"Def");
		Person p3= new Person(90,165,"Klm");
		Person p4= new Person(65,170,"Pqr");
		Person p5= new Person(70,180,"Set");
		t1.add(p1);
		t1.add(p2);
		t1.add(p3);
		t1.add(p4);
		t1.add(p5);
		
		for(Person p:t1)
		{
			System.out.println(p.weight + "," + p.height + "," + p.name);
		}

	}

}
