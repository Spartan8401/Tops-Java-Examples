package com.Practical;

import java.util.Scanner;

public class NastedTryCatch  {
public static void main(String[] args) {
	

	int a,b,c;
	Scanner sc=new Scanner(System.in);	 
 try {
	 try {
		 System.out.println("Enter the Value of A :");
			a=sc.nextInt();
			System.out.println("Enter the Value of B:");
			b=sc.nextInt();
			
			c=a/b;
			System.out.println("The result Of C:"+c);
		
	} catch (ArithmeticException e) {
		System.out.println("Arithmethic Exception Caught "+e);
	} 
	 try {
		 int arr[]= {1,2,3,4,5};
		    System.out.println("Enter Index Number:");
		    int index=sc.nextInt();
		    System.out.println("Array Element Are:"+arr[index]);
		
	} catch (ArrayIndexOutOfBoundsException e2) {
		System.out.println("ArrayIndexOutOfBounds Caught"+e2);
		
	}
 }
	 catch (Exception e3) {
		 System.out.println("exception caught :"+e3);
 }

}
}