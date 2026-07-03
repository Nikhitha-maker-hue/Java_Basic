package com.qsp;

public class EncapsulationDriver {

	public static void main(String[] args) {
		Encapsulation  e=new Encapsulation();
		//System.out.println(e);
		System.out.println(e.getMax());
		e.setMax(125);
		System.out.println(e.getMax());
	}

	
}
