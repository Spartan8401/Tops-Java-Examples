package com.Practical;

import java.util.Scanner;

public class DeviedbyNumber {
  public static void main(String[] args) {
	   int i,n;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the Value Of N:");
	   n=sc.nextInt();
	   System.out.println("The Number of Divied by 3 And 5 Is:");
	  for(i=0;i<=n;i++) { 		  
	   if((i % 3==0) && (i % 5 )==0 ) {
		   System.out.println(+i);
	       
	   }
}
}
}