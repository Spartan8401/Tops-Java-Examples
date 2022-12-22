package com.Practical;

import java.util.Scanner;

public class AsciiValue {
	public static void main(String[] args) {
		char chr;
		int asciiValue;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character:");
		chr=sc.next().charAt(0);
		asciiValue=chr;
		System.out.println("Ascii Value Of"+chr+"is:"+asciiValue);
	}

}
