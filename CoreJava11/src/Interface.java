interface if3
{
	void math();
	}
interface if4{
	void math2();
}
public class Interface implements if3,if4 {
   
	public void math() {
	   System.out.println("math");	
	}

	
	public void math2() {
		System.out.println("math2");
	}

	public static void main(String[] args) {
		Interface a=new Interface();
		a.math();
		a.math2();
	}
}
