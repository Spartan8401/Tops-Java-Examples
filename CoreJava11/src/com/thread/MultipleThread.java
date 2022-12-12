package com.thread;


class NewssThread implements Runnable{

		Thread t;
		String tname;
		public NewssThread(String tname) {//parameterise Constructor
			this.tname=tname;
			t=new Thread(this,tname);
			t.start();
		}
        public void run() {
        	try {
    			for(int i=0;i<5;i++) {
    				System.out.println(t+" "+i);
    				Thread.sleep(1000);
    			}
    			
    		} catch (Exception e) {
    			e.printStackTrace();
    		}
    		System.out.println("Child Thread Exting");
			
		}
	}
	


public class MultipleThread {

	public static void main(String[] args) {
		new NewssThread("One");
		new NewssThread("Two");
		new NewssThread("Three");
		Thread t =Thread.currentThread();
		System.out.println(t);
		t.setName("My Thread");
		System.out.println("After Change Name :"+t);
		t.setPriority(7);
		System.out.println("After Chnange Priority :"+t);
		
		try {
			for(int i=0;i<5;i++) {
				System.out.println(t+" "+i);
				Thread.sleep(1000);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Main Thread Exting");
	}

}





