package com.oops.polymorphism;

public class Test {
	
	public static void main(String[] args) {
		Animal animal1 = new Animal();
		System.out.println(animal1.shout()); 

		Animal animal2 = new Dog();
		System.out.println(animal2.shout());
	}
	
}


