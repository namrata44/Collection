package com.stack;
import java.util.*;
import java.util.stream.*;
 
public class Stack4{

    public static void main(String[] args) {        
        Stack<String> stack = new Stack<String>();
        stack.push("Pune");
        stack.push("Mumbai");
        stack.push("Navimumbai");
        
        System.out.println("The Stack contents: " + stack);         
        Object[] strArray = stack.toArray();         
        System.out.println("The Array contents:"); 
        for (int j = 0; j < strArray.length; j++) 
            System.out.print(strArray[j]+ " "); 
    }
}
