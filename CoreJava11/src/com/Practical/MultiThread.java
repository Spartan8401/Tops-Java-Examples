package com.Practical;

public class MultiThread {
	public static void main(String[] args) {
		Thread t=new Thread("Thread is Running");
		t.start();
		String str=t.getName();
		System.out.println(str);
	}

}
