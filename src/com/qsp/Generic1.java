package com.qsp;

import java.util.ArrayList;

public class Generic1 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList(); //accept all  type of data because we didn't mentioned the data type here
		al.add(10);
		al.add("Alex");
		al.add(true);
		System.out.println(al);
	}

}
