package com.Practical;

public class DeomonTHread extends Thread{
   public void run() {
	   if(Thread.currentThread().isDaemon()) {
		   System.out.println("It Is Deomon Thread");
	   }
	   else {
		   System.out.println("User Thread");
	   }
   }
   public static void main(String[] args) {
	DeomonTHread t1=new DeomonTHread();
	DeomonTHread t2=new DeomonTHread();
	DeomonTHread t3=new DeomonTHread();
	
	t1.setDaemon(true);
	
	
	t1.start();
	t2.start();
	t3.start();

   }
}
