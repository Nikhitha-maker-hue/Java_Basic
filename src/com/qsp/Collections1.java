package com.qsp;
import java.util.LinkedList;
import java.util.Collections;

public class Collections1 {

	public static void main(String[] args) {
		LinkedList<Integer> L1=new LinkedList<Integer>();
		L1.add(10);
		L1.add(20);
		L1.add(5);
		L1.add(15);
		System.out.println(L1);
		
		System.out.println("Sorting");//Sorting
		Collections.sort(L1);
		System.out.println(L1);
		
		
		System.out.println("reverse");
		Collections.reverse(L1);
		System.out.println(L1);
		
		
		System.out.println("Max");
		System.out.println(Collections.max(L1));
		//System.out.println(L1);
		
		
		System.out.println("Min");
		System.out.println(Collections.min(L1));

	}

}
