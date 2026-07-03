package com.qsp;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator1 {

	public static void main(String[] args) {
		ArrayList<Integer> aList=new ArrayList<Integer>();
		aList.add(20);
		aList.add(10);
		aList.add(15);
		aList.add(26);
		aList.add(6);
		ListIterator<Integer> li=aList.listIterator();
		
		/*while(li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("=========================================================");
		for(Integer i:aList) {
			System.out.println(i);
		}*/
		System.out.println("=======================Previous===============================");
		li.next(); // if curser is pointing inb b/w 20 and 10 it will check previous will be available or not  if available print the value and go back to the top (only 20 will be printed)
		li.next();
		
		li.set(200); //20 will be replaced with 200 if one (li.next) is there if 2 or there 2nd element will be replaced with 200
		li.remove();//2nd element deleted because we pointing to 2nd element because(li.next()) we used 2 times
		System.out.println(aList);
		while(li.hasPrevious()) {
			System.out.println(li.previous());
			
		}
		
	}

}
