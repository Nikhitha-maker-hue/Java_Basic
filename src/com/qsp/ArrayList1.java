package com.qsp;
import java.util.ArrayList;
public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> al=new  ArrayList<String>();
		al.add("Mango");
		al.add("Banana");
		al.add("Batai");
		al.add("Guava");
		al.addFirst("Watermelon");//added in first
		al.addLast("Grapes");//added into last
		al.add(1,"Cherry");	//added at index 1
		al.set(3,"Apple");		//replace at given index
		System.out.println(al);
		System.out.println(al.isEmpty());	 //false
		System.out.println(al.contains("Apple"));	//true
		System.out.println(al.size());	//return size
		
		ArrayList<String>al1=new ArrayList<String>();
		al1.add("Sachin");
		al1.add("Virat");
		al1.add("Dhoni");
		al1.add("Hardhik Pandhaya");
		al.addAll(al1);         //(al)  elements  +  (al1) elements both are added into one
		al.remove(3);  	//remove index 3 element
		//al.clear();	//remove all elements
		//System.out.println(al.isEmpty()); //true
		System.out.println(al);
		System.out.println(al1);	
	}

}

