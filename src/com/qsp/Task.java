package com.qsp;

import java.util.LinkedHashSet;

public class Task {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs1=new LinkedHashSet<String>();
		lhs1.add("Delhi");
		lhs1.add("telangana");
		lhs1.add("Karnataka");
		lhs1.add("WB");
		lhs1.add("Punjab");
		lhs1.add("Gujrat");
		System.out.println(lhs1);
		lhs1.removeLast();
		System.out.println(lhs1);
		lhs1.removeFirst();
		System.out.println(lhs1);
	}

}
