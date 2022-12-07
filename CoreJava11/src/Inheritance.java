import java.util.*;
class A1{
    int a;
	void getA1() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value of A:");
	a = sc.nextInt();
	}
	void putA1() {
		System.out.println("A :"+a);
	}
}
class B1 extends A1{
	int b;
	void getB1() {
	Scanner sc =new Scanner(System.in);
    System.out.println("Ener the value of B");
    b = sc.nextInt();
	}
	void putB1() {
		System.out.println("B :"+b);
	}
}
public class Inheritance {
    public static void main(String[] args) {
		B1 b1 = new B1();
		b1.getA1();
		b1.getB1();
		b1.putA1();
		b1.putB1();
	}    
     	
}
