package com.qsp;

public class IQMain {
	public static void main(String[] args) {
		ImplementationQueue q = new ImplementationQueue();
		//q.isEmpty();
		q.display();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.display();
		q.dequeue(10);
		q.display();
		//q.isEmpty();
	}
}