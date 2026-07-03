package com.qsp;

public class DoublyMain {

	public static void main(String[] args) {
		DoublyLinkedList dll=new DoublyLinkedList();
		dll.addFirst("Samsung");
		dll.addFirst("Nokia");	
		dll.addLast("Redmi");
		dll.addLast("IPhone");
		dll.removeFirst();
		dll.removeLast();
		dll.display();
	}
}
