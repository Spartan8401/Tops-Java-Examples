package com.Practical;

import java.util.Scanner;

public class MultipleException {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter the Value of A:");
			a=sc.nextInt();
			System.out.println("Enter the Value of B:");
			b=sc.nextInt();
			
			c=a/b;
			System.out.println("The result Of C:"+c);
			int arr[]= {1,2,3,4,5};
		    System.out.println("ENter Index Number:");
		    int index=sc.nextInt();
		    System.out.println("Array Element Are:"+arr[index]);
		} catch (Exception e) {
            System.out.println("exception caught :"+e);
		}
	}

}
