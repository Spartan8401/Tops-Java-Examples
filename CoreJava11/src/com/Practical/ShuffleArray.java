package com.Practical;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {

	public static void main(String[] args) {
		List<String> list_Strings=new ArrayList<>();
		list_Strings.add("Red");
		list_Strings.add("Orange");
		list_Strings.add("Yellow");
		list_Strings.add("Balck");
		list_Strings.add("White");
		list_Strings.add("Pink");
		System.out.println("Before Shuffle:"+list_Strings);
		Collections.shuffle(list_Strings);
		System.out.println("After Shuffle:"+list_Strings);
	}
	
}
