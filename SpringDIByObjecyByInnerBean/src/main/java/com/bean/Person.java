package com.bean;

public class Person {
	private String pname;
	private Phone phone;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	
	public void PhoneCall() {
		System.out.println("Call A Phone");
		phone.Call();
	}

}
