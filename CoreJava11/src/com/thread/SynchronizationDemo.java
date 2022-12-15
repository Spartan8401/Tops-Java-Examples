package com.thread;

class Callback {
	public void call(String msg) {
		System.out.print("["+msg);
	
	  try {
		 Thread.sleep(1000);
	} catch (Exception e) {
		e.printStackTrace();	}
	System.out.println("]");
	}
  	
}
class Call implements Runnable{
	Thread t;
	String msg;
	Callback c;
	public Call(String msg,Callback c) {
		this.msg=msg;
		this.c=c;
		t=new Thread(this);
		t.start();
	}
	public void run() {
		synchronized (c) {
			c.call(msg);
		}
		
		
	}
}

public class SynchronizationDemo {
    public static void main(String[] args) {
          Callback c =new Callback();
          Call c1=new Call("Hello",c);
          Call c2=new Call("Java",c);
          Call c3=new Call("World",c);
          
}
}
