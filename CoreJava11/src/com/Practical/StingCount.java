package com.Practical;

import java.util.Scanner;

public class StingCount {
	public static void main(String[] args) {
		int i=0;
		int count=0;

		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("The Sring Is :");
		s=sc.next();
		  for(i = 0; i < String.length(); i++) {    
	            
	                count++;    
	        }    
		System.out.println("The Number Of Charcter count is:"+count);
	}

}
