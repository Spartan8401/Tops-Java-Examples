package com.Practical;

import java.util.Scanner;

public class NaturalNumber {

	public static void main(String[] args) {
		int i = 1;
		int num = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		num =sc.nextInt();
		System.out.println("Enter the Number 1 to "+num);

		while(i<=num) {
			System.out.println(i + " ");
			i++;
	        	
		}
		
	
	}
}
