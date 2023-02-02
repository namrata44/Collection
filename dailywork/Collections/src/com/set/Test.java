package com.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test {
	
	public static void main(String[]args) {
		
		LinkedHashSet <Integer>lhs= new LinkedHashSet<>();
		lhs.add(100);
		lhs.add(200);
		lhs.add(300);
		lhs.add(400);
		
		lhs.remove(100);
		System.out.println("lhs content is: ");
		Iterator<Integer> it = lhs.iterator(); 
		while(it.hasNext()) {
			System.out.print(it.hasNext()+" ,");
		}
	}

}
