package com.qsp;

import java.util.ArrayDeque;

public class Task3 {

	public static void main(String[] args) {
		ArrayDeque<Integer> a=new ArrayDeque<Integer>();
		a.offer(10);
		a.offer(20);
		a.offer(30);
		a.offer(40);
		System.out.println(a);
		System.out.println(a.peekFirst());	//
		System.out.println(a.peekFirst());
		a.poll();
		System.out.println(a);
	}

}
