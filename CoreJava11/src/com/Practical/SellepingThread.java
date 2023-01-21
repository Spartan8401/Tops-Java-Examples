package com.Practical;

public class SellepingThread {
	public static void main(String[] args) {
		Thread t=new Thread();
		System.out.println(t);
		try {
			System.out.println(t);
			Thread.sleep(2000);
		} catch (Exception e) {
              e.printStackTrace();
		}
		System.out.println("Thread Is End");
	}

}
