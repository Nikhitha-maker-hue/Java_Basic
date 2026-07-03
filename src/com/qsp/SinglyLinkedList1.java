package com.qsp;


public class SinglyLinkedList1 {
	class Node{	//class inside another classs is called innerClass
		String data;  //data is  in the form of String
		Node next;    //next address will be in the form of Node Type
		Node(String data){
			this.data=data;
			this.next=null;
			//return;
		}
	}
	Node head;
	Node tail;
	public void addLast(String data) {
		Node newNode=new Node(data);  //new node creation
		if(head==null) {
			head=newNode;
			tail=newNode;
			return;
		}
		else {
			tail.next=newNode;
			tail=newNode;
		}}
		public void display() {
			while(head!=null) {
				System.out.println(head.data);
				head=head.next;
			}
		
	}
		public void addFirst(String data) {
			Node newNode=new Node(data);
			newNode.next=head;
			head=newNode;
				
			
		}
	
}
