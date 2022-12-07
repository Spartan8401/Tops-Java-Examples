interface if1{
	static void meth1() {
		System.out.println("Math1");
	}
}
interface if2 extends if1{
	void math2();
}

public class ImplementDemo implements if1 {
	
    public void meth2() {
    	System.out.println("math2");
    }
    public static void main(String[] args) {
		ImplementDemo s =new ImplementDemo();
		if1.meth1();
		s.meth2();
				
	}
}
