package com.qsp;


public class DoublyLinkedList {
	class Node{
		Node Prev;
		String data;
		Node next;
		Node(String data){
			this.data=data;
		}
	}
	Node head;
	Node tail;
	
	
	//Add First Method
	
	public void addFirst(String data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
		}else {
			newNode.next=head;
			head.Prev=newNode;
			head=newNode;
		}
	}
	
	
	
	//Add Last Method
	
	public void addLast(String data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=tail=newNode;
		}else {
			tail.next=newNode;
			newNode.Prev=tail;
			tail=newNode;
		}
	}	
	
	
	
	//Remove First Method
	
	public void removeFirst() {
		if(head==null) {
			System.out.println("List is Empty");
			return;
		}
		if(head == tail) {
			head=tail=null;
		}else {
			head=head.next;
			head.Prev=null;
		}
	}
	
	// Remove Last Method
	public void removeLast() {
	    if (head == null) {
	        System.out.println("List is Empty");
	        return;
	    }

	    if (head == tail) {
	        head = tail = null;
	    } 
	    else {
	        tail = tail.Prev;
	        tail.next = null;
	    }
	}
	
	
	
	public void display() {
		if(head == null) {
			System.out.println("List is Empty");
			return;
		}
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"<->");
			temp=temp.next;
		}
		System.out.println("null");
	}

}
