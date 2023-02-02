package com.oops.hierarchicalinheritance;

public class Test {
	
	public static void main(String[] args) {
		
		Car c = new Car();
		c.AC();
		c.tire();
		
		Bike b = new Bike();
		b.stand();
		b.tire();
		
		Truck t = new Truck();
		t.bigtire();
		t.tire();
		t.steering();
		
	}

}
