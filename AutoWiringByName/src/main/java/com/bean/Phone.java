package com.bean;

public class Phone {
	private String pno;

	public String getPno() {
		return pno;
	}

	public void setPno(String pno) {
		this.pno = pno;
	}
	public void Call() {
		System.out.println("Calling................"+pno);
	}

}
