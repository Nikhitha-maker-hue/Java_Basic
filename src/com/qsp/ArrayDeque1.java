package com.qsp;

import java.util.ArrayDeque;

public class ArrayDeque1 {

	public static void main(String[] args) {
	ArrayDeque<Integer> a=new ArrayDeque<Integer>();
	
	 // Using Stack -->inserting from Rear side[first in last out]
	a.push(10);
	a.push(50);
	a.push(40);
	a.push(30);
	a.pop();  //remove element 30 
	System.out.println(a);//inserting from last  that rear end 
	
	// Using Queue-->insertion follows[Last in First out]
	a.offer(30);
	a.offer(10);
	a.offer(15);
	a.offer(40);
	System.out.println(a);
	}

}
