
								//Comparable Interface
package com.qsp;

import java.util.ArrayList;
import java.util.Collections;

public class Comparable1 {
	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		Student s1=new Student(10,"Sachin",89);  //creation of object
		Student s2=new Student(20,"John",75);
		Student s3=new Student(5,"Sebastian",81);
		Student s4=new Student(15,"Liza",90);
		Student s5=new Student(9,"Alex",92);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		
		Collections.sort(al);
		
		for(Student s:al) {
			System.out.println(s.toString());
		}
	}

	
	}
class Student implements Comparable<Student>{
	int rol;
	String name;
	int marks;
	public Student(int rol, String name, int marks) {
		super();
		this.rol = rol;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rol=" + rol + ", name=" + name + ", marks=" + marks + "]";
	}
	public   int compareTo(Student stu) {
		return this.rol-stu.rol;
	}
}


