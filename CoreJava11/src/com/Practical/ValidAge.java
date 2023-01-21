package com.Practical;

import java.util.Scanner;

import javax.naming.NameNotFoundException;

public class ValidAge {
	public static void main(String[] args) {
		int age,l,temp=0;
		
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter the Voter Age:");
					age=sc.nextInt();
					
					if(age<18) {
						System.out.println("You Are not aligeble for vote.");	
						throw new ArithmeticException("Invalid Age Exception");
					}
					
					try {
						 String n ;
			               l=n.length();
						  for(int i=0;i<l;i++)
				          {
				               char ch;
				              
				               ch=n.charAt(i);
				               if(ch<'A' || ch>'Z' && ch<'a' || ch>'z')
				                    temp=1;
				          }
						 String name;
						if(temp==1)
			                    throw new NameNotFoundException();
			               
			          }
			          catch(NameNotFoundException e2)
			          {
			               System.out.println(e2);
			          }
						
					
						
					
										
					System.out.println("WelCome To Voter"); 
		
					}
		 	catch (Exception e) {
		 			System.out.println("exception caught :"+e);
		 		}

		
	}
		}
	

