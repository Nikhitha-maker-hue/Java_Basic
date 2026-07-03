package com.qsp;

public class ImplementationQueue {
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	Node front;
	Node rear;
	
	//enqueue//
	public void enqueue(int data) {
		Node newNode = new Node(data);
		if(front==null) {
			front = rear = newNode;
			return;
		}
		rear.next=newNode;
		rear=newNode;
	}
	
	//dequeue//
	public void dequeue(int data) {
		Node newNode=new Node(data);
		if(front==null) {
			front=rear=newNode;
			return;
		}
		System.out.println("Deleted: "+front.data);
		front=front.next;
		if(front==null) {
			rear=null;
		}
	}
	
	
	//Display//
	public void display() {
		if(front==null) {
			System.out.println("Queue is Empty");
			return;
		}
		Node temp=front;
		
		while(temp!=null) {
			System.out.print(temp.data +" ->");
			temp=temp.next;
		}
		System.out.println("null");
	}

}