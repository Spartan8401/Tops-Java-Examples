package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class HasMapDemo {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(1, 10);
		hm.put(2, "Piyush");
		hm.put(3, "Gaurav");
		hm.put(4, "t");
		System.out.println(hm);
		System.out.println(hm.get(3));//key will be fetch the Value Of Data
	    System.out.println(hm.get("Piyush"));//Value Not Fetch the data
	    hm.put(1, 1.5);
	    System.out.println(hm.entrySet());
	    System.out.println(hm.keySet());
	    System.out.println("Itretor Data will Be Show: ");
	    
	    Set s =  hm.entrySet();
	    Iterator itr =s.iterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
	   
	}

}
