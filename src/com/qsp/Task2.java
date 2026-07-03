package com.qsp;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task2 {

	public static void main(String[] args) {
		Map<String,Double> m=new LinkedHashMap<String,Double>();
		m.put("Petrol",104.5);
		m.put("Ethane", 90.3);
		m.put("Diesel", 95.6);
		m.put("CNG", 70.88);
		System.out.println(m.entrySet());

	}

}
