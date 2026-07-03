/*
 //Single Method
package com.ty;

public class Method {
	public static void main(String[] args) {
		test();
	}
	public static void test() {
		int a=10;
		int b=20;
		int res=a+b;
		System.out.println(res);
	}
}
*/

/*
//Multiple methods
package com.ty;

public class Method {
	public static void main(String[] args) {
		add();
		sub();
	}
	public static void add() {
		int a=10;
		int b=20;
		int res=a+b;
		System.out.println(res);
	}
	public static void sub() {
		int a=20;
		int b=10;
		int res=a-b;
		System.out.println(res);
	}
}
*/

package com.ty;

public class Method {
	public static void main(String[] args) {
		add(10,20);   //method calling
		System.out.println(add(10,20));
	}
	public static int add(int a,int b) {
		return a+b;
}
	}

