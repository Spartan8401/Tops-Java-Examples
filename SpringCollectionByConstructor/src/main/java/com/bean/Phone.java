package com.bean;

public class Phone {
	private String pno;

	
	public Phone(String pno) {
		this.pno = pno;
	}


	public void Call() {
		System.out.println("Calling................"+pno);
	}
public String toString() {
	return "Phone No.:"+pno;
}
}
