package com.Practical;

import java.util.Scanner;

public class SumAndAvg {
			public static void main(String[] args) {
			int i = 1;
			int num;
			int sum=0;
			float avg=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Number:");
			num =sc.nextInt();
			System.out.println("Enter the Number 1 to "+num);

			while(i<=num) {
				System.out.println(i + " ");
				
		        sum=sum+i;
		        avg =sum/num;
		        i++;
			}
			System.out.println("The Sum is:"+sum);
			System.out.println("The Avg Is:"+avg);
		
		}
	}



