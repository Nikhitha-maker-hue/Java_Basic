package com.qsp;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.add("Doeremon");
		lhs.add("Sinchan");
		lhs.add("MotuPatlu");
		lhs.add("Sinchan");
		lhs.add("Oggy");
		lhs.removeFirst(); //remove first element
		lhs.removeLast();
		System.out.println(lhs);  //remove last element
		
	}

}
