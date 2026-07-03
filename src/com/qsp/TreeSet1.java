package com.qsp;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		TreeSet<Integer> t=new TreeSet<Integer>();
		t.add(20);
		t.add(30);
		t.add(20);
		t.add(2);
		t.add(27);
		System.out.println(t.higher(27));//after given element higher value it will print
		//t.add(25);
		System.out.println(t.ceiling(25));	//after 25 upper clogest value is available it will print
		System.out.println(t.floor(4));		//before 4 lowest value it will check and print it
		System.out.println(t.isEmpty());
		System.out.println(t);
		System.out.println(t.pollFirst()); //first element print
		System.out.println(t.pollLast());  //last element print
	}

}
