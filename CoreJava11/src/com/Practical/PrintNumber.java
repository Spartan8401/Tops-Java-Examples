package com.Practical;

import java.util.Scanner;

public class PrintNumber {
	static int x=100;
	 
     static void printn() {
    	 System.out.println("The Value Of X  is:"+x);
    	
    	
     }
     static void printn(int a) {
    	 System.out.println("The Value Of A  is:"+a);
    	
    	
     }
     
     static void printn(double b) {
    	 System.out.println("The Value Of B  is:"+b);
    	
    	
     }
     
     static void printn(String y) {
    	 System.out.println("The Value Of Y  is:"+y);
    	
    	
     }
     static void printn(char z) {
    	 System.out.println("The Value Of Z  is:"+z);
    	
    	
     }
     
     
     
     public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		printn();
		printn(10);
		printn(10.10);
		printn("Piyush");
		printn('P');
		
	}
}
