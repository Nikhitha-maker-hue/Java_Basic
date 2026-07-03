package com.qsp;

public class Stack {
	public static void main(String[] args) {
		Stack s=new Stack();
		s.push("Sheela");
		s.push("Laila");
		s.push("Joe");
		s.push("Nikhitha");
		s.push("Yamini");
		s.push("Sree");
		s.push("Sai");
		s.pop();
		s.peek();
		s.display();
	}
	class Node{
		String data;
		Node next;
		Node(String data){
			this.data=data;
		}
	}
	Node top;
	
	//Push 
	public  void push(String data) {
		Node newNode=new Node(data);
		newNode.next=top;
		top=newNode;
	} 
	
	//Pop
	public void pop() {
		if(top==null) {
			System.out.println("Stack Underflow");
			return;
		}
		System.out.println("Deleted: "+top.next);
		top=top.next;
	}
	
	//Peek
	public void peek() {
		if(top==null) {
			System.out.println("Stack is Empty");
			return;
			
		}
		System.out.println("Top Element: "+top.data);
	}
	
	
	//Display
	public void display() {
		if(top==null) {
			System.out.println("Stack is Empty");
			return;
		}
		Node temp=top;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
}
