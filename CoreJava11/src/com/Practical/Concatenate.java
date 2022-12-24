package com.Practical;

import java.util.Scanner;

public class Concatenate {
	public static void main(String[] args) {
		String a,b;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the First String a:");
		a=sc.nextLine();
		System.out.println("Enter The Second String b:");
		b=sc.nextLine();
		
		a=a.concat(b);
		
		System.out.println("The Concatenate String a and b is:"+a);
	}

}
