package com.javaAssignment4;

public class Bird extends Animal {

	public static void main(String[] args) {
		
		//Animal a1= new Animal();  // cannot instantiate
		Animal a2=new Bird();     //instantiating 
		a2.sound();
		

	}

	@Override
	public void sound() {
		System.out.println("Humming");
		
	}

}
