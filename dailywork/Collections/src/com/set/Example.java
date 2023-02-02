package com.set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Example
{
    //main method
    public static void main (String[] args)
    {
        //Syntax: Set<Datatype> nameofSet = new TreeSet<datatype>()
        Set<Integer> t = new LinkedHashSet<Integer>();
        
        //To append to a Set
        t.add(5);
        t.add(8);
        t.add(5);
        t.add(9);
        System.out.println(t);//prints 5, 8, 9
        t.add(-8);
        t.remove(8);
        
        
        boolean m = t.contains(5);
        System.out.println(m);
        System.out.println(t);
        
    }
}
