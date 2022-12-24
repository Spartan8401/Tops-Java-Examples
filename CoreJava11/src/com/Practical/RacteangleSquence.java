package com.Practical;

import java.util.Scanner;

public class RacteangleSquence {
  static double x,y;
  static double S;
   static void Major(double x,double y) {
	   S=x*y;
	   System.out.println("The Area Of Ractangle is :"+S);
   }
   
   static void Major(double x) {
	   S=x*x;
	   System.out.println("The Area Of Squre is :"+S);
   }
   
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Value Of X:");
	x=sc.nextInt();
	System.out.println("Enter the Value Of X:");
	y=sc.nextInt();
	Major(x,y);
	Major(x);
	
}
	
}
