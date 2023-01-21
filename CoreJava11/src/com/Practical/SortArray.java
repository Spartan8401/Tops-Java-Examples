package com.Practical;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArray {
	
	public static void main(String[] args) {
		List<String> list_Strings=new ArrayList<>();
		list_Strings.add("Red");
		list_Strings.add("Orange");
		list_Strings.add("Yellow");
		list_Strings.add("Balck");
		list_Strings.add("White");
		list_Strings.add("Pink");
		System.out.println("Before Sort List"+list_Strings);
		Collections.sort(list_Strings);
		System.out.println("After Sort List"+list_Strings);
	}
	

}
