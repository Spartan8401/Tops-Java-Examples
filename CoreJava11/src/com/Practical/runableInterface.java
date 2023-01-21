package com.Practical;

public class runableInterface  implements Runnable{
	public void run() {
		System.out.println("Thread is Running");
	}
   public static void main(String[] args) {
	runableInterface r=new runableInterface();
	Thread t1 =new Thread(r);
	t1.start();
}
}
