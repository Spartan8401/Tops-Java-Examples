package com.Practical;

import java.util.ArrayList;
import java.util.List;

public class SpecificIndexArray {

	public static void main(String[] args) {
		List<String> list_Strings=new ArrayList<>();
		list_Strings.add("Red");
		list_Strings.add("Orange");
		list_Strings.add("Yellow");
		list_Strings.add("Balck");
		list_Strings.add("White");
		list_Strings.add("Pink");
		System.out.println(list_Strings);
		
		String element=list_Strings.get(0);
		System.out.println("First Element is:"+element);
		
		String element1=list_Strings.get(2);
		System.out.println("THird Element is:"+element1);
		
	}
	
}
