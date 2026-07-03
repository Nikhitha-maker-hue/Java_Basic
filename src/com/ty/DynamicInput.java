package com.ty;

import java.util.Scanner;

public class DynamicInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		/*
		System.out.println("Enter 1st Number: ");
		int a=sc.nextInt();
		System.out.println("Enter 2nd Number: ");
		int b=sc.nextInt(); 
		//System.out.println("Result is :" +a+b);//concatination
		System.out.println(a+b+ " is the Result");//addition
		*/
		System.out.println("Enter a word: ");
		String s= sc.next();
		System.out.println("Your word is:"+s);
	}

}
