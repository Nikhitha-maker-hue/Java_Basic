package com.qsp;
import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {
		/*
		System.out.println("Program Starts");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the 1st number: ");
		int a=s.nextInt();
		System.out.println("Enter the 2nd  number: ");
		int b=s.nextInt();
		int c=a/b;
		System.out.println(c);
		System.out.println("Program Ends ");
*/
		
		//EXCEPTION HANDLING
		
		System.out.println("Program Starts");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the 1st number: ");
		int a=s.nextInt();
		System.out.println("Enter the 2nd  number: ");
		int b=s.nextInt();
		try {
			int c=a/b;
		}
		catch(ArithmeticException e) {
			System.out.println("You cannot divide by zero");		
		}
		System.out.println("Program Ends ");
	}

}
