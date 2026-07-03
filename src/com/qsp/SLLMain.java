package com.qsp;

import java.util.Scanner;

public class SLLMain {

	public static void main(String[] args) {
		SinglyLinkedList1 sll=new SinglyLinkedList1();
		sll.addLast("Sachin");
		sll.addLast("PRC");
		sll.addLast("sach"); 
		
		/*sll.addLast("Hello");
		sll.addLast("World");
		sll.addFirst("Java");
		sll.addLast("Advanced Java");
		sll.addFirst("React");
		sll.display();*/
		
		
		
		
		
		System.out.println("================ MENU ====================");
		System.out.println("1.Add Last");
		System.out.println("2.Add First");
		System.out.println("Enter your choice: ");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter the data: ");
			sll.addLast(sc.nextLine()); break;
		case 2:
			System.out.println("Enter the data: ");
			sll.addFirst(sc.nextLine());break;
		}
		sll.display();
		
	}

}
