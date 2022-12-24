package com.Practical;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		int i,num;
		int fact=1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number is:");
		num=sc.nextInt();
		
		for(i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("The Factotial Value of "+num+" is:"+fact);
	}

}
