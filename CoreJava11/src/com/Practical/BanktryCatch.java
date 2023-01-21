package com.Practical;

import java.util.Scanner;

public class BanktryCatch {
		public static void main(String[] args) {
			int AccoBalance=2000;
			int WithdrawAmount,e,e2;
			Scanner sc=new Scanner(System.in);
			try {
				System.out.println("Enter the Amount You want to Withdraw:");
				 WithdrawAmount=sc.nextInt();
						if( WithdrawAmount> AccoBalance) {
							e= WithdrawAmount-AccoBalance;
							System.out.println("Sorry, insufficient balance, you need more "+e+" Rs. To perform this transaction.");	
							throw new ArithmeticException("Invalid balance Exception");
						}
						
			  else
				        e2=AccoBalance- WithdrawAmount;
						System.out.println("You Are Withdraw Amount is:"+WithdrawAmount);
						System.out.println("Your Account Balance Is: "+e2); 
			
			}
			 catch (Exception e1) {
				 System.out.println("exception caught :"+e1);
		 }

			}
		
	}


