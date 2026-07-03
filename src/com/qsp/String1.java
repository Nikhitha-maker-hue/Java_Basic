package com.qsp;

public class String1 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("University");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		/*
		StringBuilder sb1=new StringBuilder();
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());//default capacity-16  */
		
		StringBuilder sb1=new StringBuilder("Bottle");
		StringBuilder sb2=new StringBuilder();
		System.out.println(sb1.append('p'));
		System.out.println(sb1.lastIndexOf("Bott"));
		System.out.println(sb1.capacity());
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
	}
}
