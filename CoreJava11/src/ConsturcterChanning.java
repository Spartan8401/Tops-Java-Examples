
class Base{
	Base(){
		System.out.println("This is Base Class");
	}
  void Show(){
		System.out.println("This Base class method");
	}
}
class Derived extends Base{
	Derived(){
		System.out.println("This is Derived Class");
	}
	 void Show(){
		 super.Show();
			System.out.println("This Derived class method");
		}
}
class SubDerived extends Derived{
	SubDerived(){
		System.out.println("This is SubDerived Class"); 
	}
	 void Show(){
		    super.Show();
			System.out.println("This SubDerived class method");
		}
}
public class ConsturcterChanning {
         public static void main(String[] args) {
			SubDerived s = new SubDerived();
			s.Show();
			
		}
}
