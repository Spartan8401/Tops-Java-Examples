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
class C extends B{
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
public class MultilevelInheritance {
    public static void main(String [] args) {
    	C c1 = new C();
    	c1.getA();
    	c1.getB();
    	c1.getC();
    	c1.putA();
    	c1.putB();
    	c1.putC();
    	}
}
