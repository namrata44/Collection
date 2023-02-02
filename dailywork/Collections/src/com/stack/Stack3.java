package com.stack;
import java.util.Stack;

public class Stack3 {
    public static void main(String a[]){
       
        Stack<Integer> stack = new Stack<>();
        System.out.println("Initial stack : "  + stack);
        System.out.println("Is stack Empty? : "  + stack.isEmpty());       
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);        
        System.out.println("Stack after push operation: "  + stack);        
        System.out.println("Element popped out:"  + stack.pop());
        System.out.println("Stack after Pop Operation : "  + stack);        
        System.out.println("Element 10 found at position: "  + stack.search(10));
        System.out.println("Is Stack empty? : "  + stack.isEmpty());
    }
}       
