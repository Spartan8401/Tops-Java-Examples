package com.p1;

public class Derived1 {
     public Derived1() {
    	 Protected sc = new Protected();
    	 System.out.println("nonDerived Consructer Called");
 		System.out.println("N:"+sc.n);
 		System.out.println("N1:"+sc.n1);
 		//System.out.println("N2:"+sc.n2);Private Varible not access.
 		System.out.println("N3:"+sc.n3);
     }
}
