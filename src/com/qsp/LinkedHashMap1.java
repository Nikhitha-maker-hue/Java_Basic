package com.qsp;
import java.util.LinkedHashMap;

public class LinkedHashMap1 {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> lhs=new LinkedHashMap<Integer,String>();
		lhs.put(101,"Alex");
		lhs.put(130,"liza");
		lhs.put(111,"John");
		lhs.put(119,"Sam");
		lhs.put(119, "Nikhitha");//same key is there so updated value is printed
		lhs.put(124,"sebastian");	
		System.out.println(lhs);
		System.out.println(lhs.values());
		System.out.println(lhs.keySet());
		System.out.println(lhs.entrySet());	//follow the insertion order
		System.out.println(lhs.get(124));
	}

}
