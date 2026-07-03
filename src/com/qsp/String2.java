package com.qsp;
public class String2 {
	public static void main(String[] args) {
		/*String str=new String("Sachin is a cricketer");
		String str1 = "10";
		System.out.println(str==str1);
		System.out.println(str.charAt(5));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.substring(2));
		System.out.println(str.length());
		System.out.println(str.substring(7, 21)); */
		
		String str = "Sachin";
		String str1 = new String("Sachin");
		System.out.println(str.length());
		
		System.out.println(str.equals(str1)); // false
		
		String s = "Man";
		String s1="Manipur";
		System.out.println(s.compareTo(s1));
	
	}
}