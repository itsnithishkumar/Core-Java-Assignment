package com.collectionframework5;

import java.util.HashMap;
import java.util.Set;

public class Behavior {

	public static void main(String[] args) {
		Employee e=new Employee();
		Boolean n1= e.equals();
		int  n2=e.Hashcode();
		
		HashMap<Comparable, Object> b=new HashMap<Comparable, Object>();
		Set<String> s1=b.entrySet();
				
	    b.put(n1, "Rajesh");
		b.put(n2, "Suresh");
		b.put(4, "Ramesh");
			
		System.out.println(s1);
		System.out.println(b.get(true));
		System.out.println(b.getOrDefault(1, e));

	}

}
