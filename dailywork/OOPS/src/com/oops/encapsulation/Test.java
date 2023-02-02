package com.oops.encapsulation;

public class Test extends Employee {
	
	public static void main(String[]args) {
		
		Employee e = new Employee();
		
		e.setName("vijay"); 
	    e.setAge(23);
	    e.setAddress("Mumbai");
	    e.setPhonenumber(776545664);
	    
	    System.out.println(e.getName());
	    System.out.println(e.getAge());
	    System.out.println(e.getAddress());
	    System.out.println(e.getPhonenumber());
	    
	    
	}

}
