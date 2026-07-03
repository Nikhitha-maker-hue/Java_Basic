package com.qsp;

public class MobileDriver {

	public static void main(String[] args) {
		Mobile m=new Mobile();
		m.display();
		IPhone i=new IPhone();
		i.display();
		Mobile m1=new IPhone();//Mobile m1=(Mobile)new IPhone();//Upcasting
		m1.display();
	} 
}
