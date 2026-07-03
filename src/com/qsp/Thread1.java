/*package com.qsp;

public class Thread1 {
	

	public void test() {
		for(int i=0;i<10;i++) {
			System.out.println("Namaste");
		}
	}
	public static void main(String[] args) {
		Thread1 t=new Thread1();
		t.test();
		Thread2 t1=new Thread2();
		t1.test();
	}

}
class Thread2{
	public void test() {
		for(int i=0;i<10;i++) {
			System.out.println("Dhanyawad");
		}
	}
}	*/

	//Extended thread class   

package com.qsp;

public class Thread1 extends Thread{
	

	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Namaste");
		}
	}
	public static void main(String[] args) {
		Thread1 t=new Thread1();
		t.start();
		Thread2 t1=new Thread2();
		t1.start();
	}

}
class Thread2 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Dhanyawad");
		}
	}
}	