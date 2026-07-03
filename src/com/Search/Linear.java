package com.Search;
import java.util.Scanner;

public class Linear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		int[] arr= {20,6,7,4,13,50};
		int search=13;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==search) {
				System.out.println("Element found at position: " +i);
			}
		}
	}

}




