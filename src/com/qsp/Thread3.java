package com.qsp;
import java.util.Scanner;

public class Thread3 implements Runnable {
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Hellooo");
		}
	}
	public static void main(String[] args) {
		Thread3 t=new Thread3();
		Thread t1=new Thread(t);//internally present in lang packagge do not import it always take lang package execute always directly
		//Scanner s=new Scanner(System.in);
		Thread4 t2=new Thread4();
		Thread t3=new Thread(t2);
		t1.start();
		t3.start();
	}
}
class Thread4 implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Apple");
		}
	}
}

