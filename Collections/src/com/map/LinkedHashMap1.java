package com.map;

import java.util.LinkedHashMap;

public class LinkedHashMap1 {
    public static void main(String[] args) {        
        LinkedHashMap<String, Integer> Mapping = new LinkedHashMap<>();

        Mapping.put("one", 1);
        Mapping.put("two", 2);
        Mapping.put("three", 3);
        Mapping.put("four", 4);
        
        Mapping.putIfAbsent("five", 5);

        System.out.println(Mapping);
    }
}