package com.qsp;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue2 {

	public static void main(String[] args) {
		Queue<Integer> q=new PriorityQueue<Integer>();
		q.add(10);
		q.add(20);
		q.add(30);
		System.out.println(q);
		q.remove();	//remove one element at a time
		q.remove();
		q.remove();	
		//q.remove();	//given error message because there only 3 elements  
		System.out.println(q);

	}

}
