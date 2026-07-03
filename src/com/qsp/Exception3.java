package com.qsp;

public class Exception3 {

	public static void main(String[] args) {
		int age=1;
		try {
		if (age<18) {
			throw new ArithmeticException("Not Eligible");
		}
		}catch(Exception e) {
			System.out.println("Not Allowed");
		}
		System.out.println("Thank You");
	}
}
