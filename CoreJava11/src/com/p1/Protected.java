package com.p1;

public class Protected {
	int n=10;
	protected int n1=100;
	private int n2=1000;
	public int n3=100000;
	
	public Protected() {
		System.out.println("Protected Consructer Called");
		System.out.println("N:"+n);
		System.out.println("N1:"+n1);
		System.out.println("N2:"+n2);
		System.out.println("N3:"+n3);
	}

}
