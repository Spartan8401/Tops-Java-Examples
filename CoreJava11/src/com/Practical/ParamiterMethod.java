package com.Practical;

import java.util.Scanner;

public class ParamiterMethod {
	static int x;
	static char y;
	
	static void Mathod(int x,char y) {
		System.out.println("The Integer x is: "+x+" and Char Y is : " +y);
	}
    static void Mathod(char y,int x) {
    	System.out.println("The Char Y is: "+y+" and Int X is : " +x);	
    }
    
    public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Value Of X:");
		x=sc.nextInt();
		System.out.println("Enter the Value Of Y:");
		y=sc.next().charAt(y);
		Mathod(x,y);
		Mathod(y,x);
	}
}
