
abstract class abs1 {
	void math1() {
		System.out.println("math1");
	}
	abstract void math2();

}
class abs2 extends abs1{
      void math2() {
    	 System.out.println("math2");
     }
}
public class AbstractionDemo{
	public static void main(String[] args) {
		abs2 s= new abs2();
		s.math1();
		s.math2();
		
	}
}