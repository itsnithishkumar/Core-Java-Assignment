package com.singleton;

public class Singleton {
	
	private static Singleton obj;
	private Singleton() {
		
	}
	
	public static Singleton getObj() {
		
		if(obj == null)
		{
			obj = new Singleton();
		}
		return obj;
	}

	public void success() {
		System.out.println("Object created");
		
	}
	
	

}