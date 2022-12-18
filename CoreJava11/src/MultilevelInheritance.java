import java.util.*;

class E{
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
class F extends E{
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
class G extends F{
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
    	G c1 = new G();
    	c1.getA();
    	c1.getB();
    	c1.getC();
    	c1.putA();
    	c1.putB();
    	c1.putC();
    	}
}
