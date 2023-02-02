package com.map;
import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
    public static void main(String[] args) {        
        Map<String, Integer> Mapping = new HashMap<>();
       
        Mapping.put("One", 1);
        Mapping.put("Two", 2);
        Mapping.put("Three", 3);
        
        Mapping.putIfAbsent("Four", 4);

        System.out.println(Mapping);
    }
}
