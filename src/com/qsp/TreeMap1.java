package com.qsp;

import java.util.TreeMap;

public class TreeMap1 {
	public static void main(String[] args) {
		TreeMap<Integer,String> t=new TreeMap<Integer,String>();
		t.put(102,"Royal");
		t.put(101, "JAWA");
		t.put(105,"Duke");
		t.put(111, "TVS");
		t.put(115,"YEZDI");
		t.put(119, "Pulsar");
		System.out.println(t.entrySet());
		System.out.println(t.values());
		System.out.println(t.get(105));
		System.out.println(t.keySet());
	}
}
