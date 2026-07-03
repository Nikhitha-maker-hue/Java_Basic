package com.qsp;

import java.util.Iterator;
import java.util.LinkedList;

public class Iterator1 {

	public static void main(String[] args) {
		LinkedList<String> s=new LinkedList<String>();
		s.add("Alex");
		s.add("John");
		s.add("Johnathan");
		s.add("Joe");
		s.add("Joge");
		Iterator<String> i= s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
