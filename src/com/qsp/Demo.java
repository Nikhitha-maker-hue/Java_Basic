/*
package com.qsp;

public class Demo {
	public Demo() {     //No-argument Constructor
		System.out.println("I am a no arg constructor");
	}
	public Demo(int a) {	//parameterized constructor
		System.out.println("I am a parameterized constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Demo d=new Demo();
		Demo d=new Demo(10);
		
	}

}
*/


package com.qsp;

public class Demo {
	int max=40;
	public Demo() {     //No-argument Constructor
		System.out.println("I am a no arg constructor");
	}
	public Demo(int max) {	//parameterized constructor
		System.out.println("I am a parameterized constructor");
		System.out.println(this.max);//(this.max)
		System.out.println(max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Demo d=new Demo();
		//Demo d=new Demo(10);
		//System.out.println(d.max);
	}

}
