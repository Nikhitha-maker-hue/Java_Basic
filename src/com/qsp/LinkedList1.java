package com.qsp;
import java.util.LinkedList;
public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList<String> LL=new LinkedList<String>();
		LL.add("Apple");
		LL.add("Orange");
		LL.add("Grapes");
		LL.add("Guava");
		System.out.println(LL);
		
		LinkedList<String> LL1=new LinkedList<String>();
		LL1.add("Lg");
		LL1.add("Samsung");
		LL1.add("Redmi");
		System.out.println(LL1);
		
		LL1.addAll(LL);
		System.out.println(LL1);
				
				}

}
