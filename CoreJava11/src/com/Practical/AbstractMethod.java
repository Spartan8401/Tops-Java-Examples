package com.Practical;


abstract class abs1 {
	void math1() {
		System.out.println("This is a Parent class");
	}
	abstract void math2();

}
class abs2 extends abs1{
      void math2() {
    	 System.out.println("This is Child Class ");
     }
}
public class AbstractMethod{
	public static void main(String[] args) {
		abs2 s= new abs2();
		s.math1();
		s.math2();
		
	}
}


