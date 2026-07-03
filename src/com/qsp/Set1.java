package com.qsp;
import java.util.HashSet;
import java.util.Set;

public class Set1 {

	public static void main(String[] args) {
		Set<Integer> s=new HashSet<>();		//upcasting
		s.add(15);
		s.add(10);
		s.add(30);
		s.add(null);
		s.add(10);
		s.add(null);
		System.out.println(s.contains(15));
		System.out.println(s);
		
		for(Integer i:s) {
			System.out.println(i);
		}
	}

}
