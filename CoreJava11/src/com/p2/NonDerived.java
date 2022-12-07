package com.p2;

import com.p1.Protected;

public class NonDerived {
	public NonDerived() {
		Protected sc = new Protected();
		System.out.println("NonProtected Consructer Called");
		//System.out.println("N:"+sc.n);Defult Is Not Access In another Package and not exteds class
		//System.out.println("N1:"+sc.n1);Protected Is Not Access In another Package and not exteds class
		//System.out.println("N2:"+sc.n2);Private Is Not Access In another Package and not exteds class
		System.out.println("N3:"+sc.n3);
	}

}
