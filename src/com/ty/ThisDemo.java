package com.ty;

public class ThisDemo {
	int a=10;
	static int b=20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisDemo td=new ThisDemo();
		td.test();

	}
	public  void test() {
		int a=50;
		int b=100;
		System.out.println(this.a);
		//System.out.println(this.b);
		System.out.println(a);
		System.out.println(b);
	}
}
