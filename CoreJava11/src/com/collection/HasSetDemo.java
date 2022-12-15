package com.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class HasSetDemo {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add("tops");
		hs.add('t');
		hs.add(10);
		hs.add(10.10);
		hs.add(null);
		
		System.out.println(hs);
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		System.out.println(" Data Show: ");
		Iterator itr =hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
