package com.Practical;

public class CheckString {
		public static void main(String[] args) {
			String S1="Red Is My Favourite Color ";
			String S2="Orange Is My Favourite Color ";
			
			String Start_str= "Red";
			boolean Start1= S1.startsWith(Start_str);
			boolean Start2=S2.startsWith(Start_str);
			
			System.out.println(S1+ "Start With " +Start_str+ ":"+Start1);
			System.out.println(S2+ "STart With " +Start_str+ ":"+Start2);
		}
	}

