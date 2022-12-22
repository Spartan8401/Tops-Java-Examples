package com.Practical;

import java.util.Scanner;

public class Result {
	
	   public static void main(String[] args) {
		int rno,s1,s2,s3,total,per;
		String sname;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Rno:");
		rno = sc.nextInt();
		System.out.println("Enter the Name Of SudentName");
		sname =sc.next();
		System.out.println("Enter the English Subject Mark");
		s1 = sc.nextInt();
		System.out.println("Enter the Maths Subject Mark");
		s2 = sc.nextInt();
		System.out.println("Enter the Computer Subject Mark");
		s3 = sc.nextInt();
		total = s1+s2+s3;
		System.out.println("Ronumber:"+rno);
		System.out.println("Name:"+sname);
		System.out.println("S1:"+s1);
		System.out.println("S2:"+s2);
		System.out.println("S3"+s3);
		System.out.println("Total Marks:"+total);
		per = total/3;
		System.out.println("Pertange:"+per);
	    if(per>90) {
	    	System.out.println("Per AA");
	    }
	    else if(per>80){
	    	System.out.println("Per AB");
	    }
	    else if(per>70) {
	    	System.out.println("Per BB");
	    }
	    else if(per>60){
	    	System.out.println("Per CC");
	    }
	    else if(per>50){
	    	System.out.println("Per CD");
	    }
	    else if(per>40){
	    	System.out.println("Per DD");
	    }
	    else {
	    	System.out.println("FAIL");
	}
	}


}
