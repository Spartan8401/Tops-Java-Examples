package com.Practical;

public class EndString {
 
	public static void main(String[] args) {
		String S1="Java Exercies";
		String S2="Java Exercise";
		
		String End_str= "se";
		boolean end1= S1.endsWith(End_str);
		boolean end2=S2.endsWith(End_str);
		
		System.out.println(S1+ "End With " +End_str+ ":"+end1);
		System.out.println(S2+ "End With " +End_str+ ":"+end2);
	}
}
