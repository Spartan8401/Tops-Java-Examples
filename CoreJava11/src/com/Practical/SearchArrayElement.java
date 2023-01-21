package com.Practical;

import java.util.ArrayList;
import java.util.List;

public class SearchArrayElement {
	
	public static void main(String[] args) {
		List<String> list_Strings=new ArrayList<>();
		list_Strings.add("Red");
		list_Strings.add("Orange");
		list_Strings.add("Yellow");
		list_Strings.add("Balck");
		list_Strings.add("White");
		list_Strings.add("Pink");
		System.out.println(list_Strings);
		
		if(list_Strings.contains("Red")) {
			System.out.println("Found The Element");
		}
		else {
			System.out.println("There is no such element");
		}
	}
	

}
