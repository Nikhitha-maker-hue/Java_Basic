package com.qsp;
import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		Stack<Integer> s=new Stack<Integer>();
		s.push(10);			//adding elementing into the stack
		s.push(20);
		s.push(30);
		s.pop();    //remove the top element it follow the last in first out method
		System.out.println(s.empty());  //boolean type result it will give
		System.out.println(s);
		
		
	}

}
