package com.qsp;

abstract class Example {
	abstract void display();
	abstract void display1(); //3
}
//class Example1 extends Example{ //2	
	abstract class Example1 extends Example{  //5
	public void display()
	{
		
	}
	/*
	public void display1() { //3
		
	}
	*/
	class Example2 extends Example1{    	//6
		public void display1() {
			
		}
	}
}
abstract class Example3{			//6
	abstract void display3();
}