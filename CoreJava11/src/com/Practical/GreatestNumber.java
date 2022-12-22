package com.Practical;

import java.util.Scanner;

public class GreatestNumber {
	public static void main(String[] args) {
		int A,B,C;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value Of A:");
		A=sc.nextInt();
		System.out.println("Enter the Value Of B:");
		B=sc.nextInt();
		System.out.println("Enter the Value Of C:");
		C=sc.nextInt();
		
		if(A>B) {
			if(A>C) {
				System.out.println("A is Greater");
			}
			else {
				System.out.println("C is Greater");
			}
		}
			else{
				if(B>C) {
					System.out.println("B is Greater");
				}
				else {
					System.out.println("C is Greater");
				}
			}
		}
	

}
