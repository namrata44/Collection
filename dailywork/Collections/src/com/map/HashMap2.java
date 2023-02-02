package com.map;

import java.util.HashMap;
import java.util.Map;

public class HashMap2 {
    public static void main(String[] args) {

        Map<Integer, Employee> Map = new HashMap<>();
        Map.put(1001, new Employee(1001, "Rajeev", "Bengaluru"));
        Map.put(1002, new Employee(1002, "David", "New York"));
        Map.put(1003, new Employee(1003, "Jack", "Paris"));

        System.out.println(Map);
    }
}
