package com.Practical;

import java.util.Scanner;

public class ValidAge  {
	public static void main(String[] args) {
		int age;
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter the Voter Age:");
					age=sc.nextInt();
					if(age<18) {
						System.out.println("You Are not aligeble for vote.");	
						throw new ArithmeticException("Invalid Age Exception");
					}
					
		  else
					System.out.println("WelCome To Voter"); 
		
		}
		 catch (Exception e) {
			 System.out.println("exception caught :"+e);
	 }

		}
	
}
