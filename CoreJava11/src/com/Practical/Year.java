package com.Practical;

import java.util.Scanner;

public class Year {
   public static void main(String[] args) {
          int Year;
          System.out.println("Enter the Year :");
          Scanner sc= new Scanner(System.in);
          Year =sc.nextInt();
          if(((Year % 4==0) || (Year % 100!= 0 ))&&(Year/400==0)){
        	System.out.println("Specified year is a leap year");  
          }
          else {
              System.out.println("Specified year is not a leap year");
        }
 }
}
