package com.exception;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		CheckingBalance c =new CheckingBalance(101,1000);
		
		while(true) {
			System.out.println("1.Deposite");
			System.out.println("2.Withdraw");
			System.out.println("3.ChekingBalance");
			System.out.println("4.Exit");
			
			System.out.println("Enter your choise:");
			int choice=sc.nextInt();
			if(choice == 1) {
				System.out.println("Enter deposite Amount: ");
				double amount = sc.nextDouble();
				c.deposite(amount);
				System.out.println("Your Current Balance Is:"+c.balance);
			}
			else if(choice == 2){
				try {
					System.out.println("Enter amount you want to withdraw:");
					double amount=sc.nextDouble();
					c.withdraw(amount);
					System.out.println("Your Current Balance Is:"+c.balance);
				}catch(Insuficientfunds e) {
					System.out.println("Sorry You need to Another "+e.getAmount(choice)+" Rs. inside your Account.");
				}
			}
			else if(choice ==3) {
				c.curentbalance(choice);
			}
			else {
				break;
			}
		}
	}

}
