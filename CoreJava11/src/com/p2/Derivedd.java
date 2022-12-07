package com.p2;

import com.p1.Protected;

public class Derivedd  extends Protected{
	public Derivedd() {
	System.out.println("Derivedd Consructer Called");
	//System.out.println("N:"+n);//default is not access in another Package
	System.out.println("N1:"+n1);
	//System.out.println("N2:"+n2);//Private is Not Access In another Package
	System.out.println("N3:"+n3);
}
}