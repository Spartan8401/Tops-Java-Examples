package com.Practical;

import java.util.Scanner;

public class CountNumber {
	public static void main(String[] args) {
		int num;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Positive Number:");
		num=sc.nextInt();
		if(num>0) {
			 while (num != 0) {
			      
			      num /= 10;
			      ++count;
			    }
			System.out.println("The Number of Digits: "+count);
		}
		else
			System.out.println("Enter Positive Number.");
		
	}

}
