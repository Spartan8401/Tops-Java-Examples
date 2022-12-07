public class StaticMethod {
  static int a=10;
  static int b;
  {
	  System.out.println("block1");
  }
  static void math(int x) {
	  System.out.println("X:"+x);
	  System.out.println("A:"+a);
	  System.out.println("B:"+b);
  }
  public StaticMethod() {
	  System.out.println("Constructer Called");
  }
  static {
	  System.out.println("The static block");
	  b = a*5;
  }
  {
	  System.out.println("block2");
  }
	  public static void main(String []args) {
		  StaticMethod sc = new StaticMethod();
		  math(12);
		  
	  
  }
}
