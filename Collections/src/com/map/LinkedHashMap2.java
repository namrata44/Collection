package com.map;

import java.util.LinkedHashMap;

public class LinkedHashMap2 {
    public static void main(String[] args) {
        LinkedHashMap<String, String> Mapping = new LinkedHashMap<>();

        Mapping.put("Rajeev", "Jennifer");
        Mapping.put("John", "Maria");
        Mapping.put("Chris", "Lisa");
        Mapping.put("Steve", "Susan");

        System.out.println("Mapping : " + Mapping);
        
        String wife = Mapping.remove("John");
        System.out.println("Removed John and his wife " + wife + " from the mapping. New Mapping : " + Mapping);
        
        boolean isRemoved = Mapping.remove("John", "Susan");
        System.out.println("Did John get removed from the mapping? : " + isRemoved);
    }
}
