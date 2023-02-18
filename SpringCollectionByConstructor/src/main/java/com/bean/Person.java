package com.bean;

public class Person {

	private String pname;
	private Phone phone;
	public Person(String pname, Phone phone) {
		this.pname = pname;
		this.phone = phone;
	}
	
	public void PhoneCall() {
		System.out.println("Call A Phone");
		phone.Call();
	}

	public String toString() {
		return "Pname :"+pname+"\nPhone:"+phone;
	}
}
