package com.ty;

public class Demo1 {
	int ram=4;
	float price=5000.0f;
	public void call() {
		System.out.println("Calling using iphone");
	}
	public static void main(String [] args) {
		Demo1 ref= new Demo1();
		System.out.println(ref.ram);
		ref.call();
	}
}
