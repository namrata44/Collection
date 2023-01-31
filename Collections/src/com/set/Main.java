package com.set;

import java.util.HashSet;

public class Main {

	public static void main(String[]args) {
		HashSet<Book>set = new HashSet<Book>(); 
			
		Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8); 	
		Book b2=new Book(111,"Java","P Naidu ","Ex",3);
		Book b3=new Book(444,"Embedded C","Yogesh ","NN",6);
		Book b4=new Book(444," Introduction to C","Shahrukh ","SK",4);
		
		
		set.add(b1);
		set.add(b2);
		set.add(b3);
		set.add(b4);
		
		for(Book.b:set); {
			
		System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		
			
		}		
		
	
			
	}

}
