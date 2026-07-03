package com.qsp;
import java.util.HashSet;
import java.util.Iterator;
public class HashSet2 {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(20);
		hs.add(15);
		hs.add(3);
		hs.add(56);
		hs.add(78);
		hs.add(34);
		System.out.println(hs);
		Iterator<Integer> itr=hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
