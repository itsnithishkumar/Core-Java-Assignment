package com.collection1;

public class Person implements Comparable<Person> {

	public int height;
	public int weight;
	public String name;
	public Person(int weight, int height, String name) {
		
		this.height = height;
		this.weight = weight;
		this.name = name;
	}
	public int compareTo(Person p) {  
	    if(weight>p.weight){  
	        return 1;  
	    }
	    else if(weight<p.weight){  
	        return -1;  
	    }
	    else{  
	    return 0;  
	    }
	}
	
	

}
