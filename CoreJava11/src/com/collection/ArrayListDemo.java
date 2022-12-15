package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		al.add(10);
		al.add(10.10);
		al.add("Hello");
		al.add('t');
		al.add(null);
		al.add(true);
		al.add(10);
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.get(3));//3 Number Index Element Show
		System.out.println(al.indexOf(10));//first 10 Number Element in which index Show
		System.out.println(al.lastIndexOf(10));//last 10 Number Element in which index Show
		al.set(3, "Java");
		System.out.println(al);
		
		Iterator itr =al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		ListIterator lit=al.listIterator();
		while(lit.hasNext()) {
			System.out.println(lit.next() + " Piyush");
		}
		System.out.println("List Iterator Element:");
		
		lit =al.listIterator();
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		
        System.out.println("List Data element In Reverse: ");
		
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}

			}

}
