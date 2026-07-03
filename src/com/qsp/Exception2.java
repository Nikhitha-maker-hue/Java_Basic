package com.qsp;

public class Exception2 {

	public static void main(String[] args) {
		/*
		//ArrayIndexOutOfBoundException
		int[] arr= {10,20,30};
		System.out.println(arr[4]);*/
		
		//StringIndexOutOfBoundException
		/*String s="Hello";
		System.out.println(s.length());
		System.out.println(s.charAt(6));*/
		
		//NullPointerException
		/*String s=null;
		System.out.println(s.length());
		System.out.println(s.charAt(6));*/
		
		//MultipleExceptions(try with multiple catch)
	/*  int a=10;
		int b=0;
		String s=null;
		try {
			//int c=a/b;
			System.out.println(s.length());
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot Divide by Zero");
			}
		catch(NullPointerException e) {
			System.out.println("Cannot get the length for null");
			//e.printStackTrace();  Exception name it will give 
			//e.getMessage();	*/
		
		
		int a=10;
		int b=0;
		String s="tree";
		try {
			//int c=a/b;
			System.out.println(s.length());
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot Divide by Zero");
			}
		catch(NullPointerException e) {
			System.out.println("Cannot get the length for null");
		}
		finally {
			System.out.println("I am in finally block");
		}
		System.out.println("Program Ends");
	}
}
