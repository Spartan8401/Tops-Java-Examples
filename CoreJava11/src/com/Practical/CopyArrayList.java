package com.Practical;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CopyArrayList {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		System.out.println(list);
		List<String> list1=new ArrayList<>();
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("D");
		System.out.println(list1);
		System.out.println("After The Copy Array:");
		Collections.copy(list, list1);
		System.out.println("List"+list);
		System.out.println("List1"+list1);
	}

}
