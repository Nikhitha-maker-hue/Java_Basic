package com.Search;
import java.util.Scanner;

public class Linear1 {

	public static void main(String[] args) {
		String[] arr= {"Shela","Alex","Laila","John","Liza"};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element to Search: ");
		String search=sc.nextLine();
		
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals(search)) {
			System.out.println("Element found at position "+(i+1));
			temp++;
		}
	}
		if(temp==0) {
			System.out.println("Element is not found");
		}
	}
}
