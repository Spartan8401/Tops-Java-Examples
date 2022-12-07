package com.p1;

public class Derived extends Protected {
      public Derived() {
    	  System.out.println("Direved Consructer Called");
  		System.out.println("N:"+n);
  		System.out.println("N1:"+n1);
  		//System.out.println("N2:"+n2);//Private Varivable will Be not Access
  		System.out.println("N3:"+n3);
      }
}
