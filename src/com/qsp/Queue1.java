package com.qsp;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue1 {

	public static void main(String[] args) {
		Queue<Integer> pq=new PriorityQueue<Integer>();
		System.out.println(pq.offer(10));//return boolean type 
		pq.offer(20);
		pq.offer(25);
		pq.offer(30);
		pq.offer(35);
		pq.offer(40);
		System.out.println(pq);
		pq.poll();
		pq.poll();
		pq.poll();
		pq.poll();
		pq.poll();
		pq.poll();
		System.out.println(pq.isEmpty());
		//System.out.println(pq.poll());  //first inserted  element will be delete
		//System.out.println(pq);		//after deletion the values will be printed
		System.out.println(pq.peek()); 	//top element return
	}

}
