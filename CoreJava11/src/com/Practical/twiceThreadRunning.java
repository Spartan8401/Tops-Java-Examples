package com.Practical;

public class twiceThreadRunning extends Thread {
	public void run() {
		System.out.println("Thread Running");
	}
   public static void main(String[] args) {
	twiceThreadRunning t=new twiceThreadRunning();
		t.start();
		t.start();
}
}
