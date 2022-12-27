package com.Practical;

import java.util.Scanner;

public class ArithmethicException {
	

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
		} catch (Exception e) {
            System.out.println("exception caught :"+e);
		}
	}

}


