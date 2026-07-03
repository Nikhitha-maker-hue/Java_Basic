package com.qsp;

import java.util.HashMap;
import java.util.Map;

public class Map1 {

	public static void main(String[] args) {
		Map<Integer,String> m=new HashMap<Integer,String>();
		m.put(101, "Ajay");
		m.put(117, "Dhoni");
		m.put(117, "Bumrah"); //if same key present the updated value printed
		m.put(103, "Joge");
		m.put(104,"Bumrah"); //if same value is there it will print both because key will be different
		m.put(105, "Abrar");
		m.put(109, "Sachin");
		System.out.println(m.entrySet());
		System.out.println(m.values());  	//values will be print
		System.out.println(m.keySet());	    //keys will be print
		System.out.println(m.size());		//size will be print
		System.out.println(m.get(101));		//get the  value to that key 		
		}
}
