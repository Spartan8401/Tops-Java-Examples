//it is hirachichal inheitance
import java.util.*;

class D{
	int a;
	void getA() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value A: ");
		a =sc.nextInt();
	}
	void putA() {
		System.out.println("A :"+a);
	}
}
class B extends D{
	int b;
	void getB() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value B: ");
		b =sc.nextInt();
	}
	void putB() {
		System.out.println("B :"+b);
	}
}
class C extends D{
	int c;
	void getC() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value C: ");
		c =sc.nextInt();
	}
	void putC() {
		System.out.println("C :"+c);
	}
}


public class HighbrideInheritance {
	 public static void main(String [] args) {
	     B b1 = new B();	
		 C c1 = new C();
	    	b1.getA();
	    	b1.getB();
	    	c1.getA();
	    	c1.getC();
	    	b1.putA();
	    	b1.putB();
	    	c1.putA();
	    	c1.putC();
	    	}

}
