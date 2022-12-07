
class Box{
	double width,height,depth;
	Box(){
		System.out.println("Default Constructor are called");
		width = 3;
		height = 4;
		depth = 5;		
	}
	Box(double w,double h,double d){
		System.out.println("Parametrize COnstructor called ");
		width =w;
		height = h;
		depth = d;
	}
	Box(Box b){
		System.out.println("Copy Constructor Called");
		width = b.width;
		height =b.height;
		depth = b.depth;
	}
	void Volume() {
		System.out.println("Volume:"+(width*height*depth));
	}
}
public class ConsturctorDemo {
	public static void main(String[] args) {
		Box sc = new Box();
		sc.Volume();
		Box s1 =new Box(4,5,6);
		s1.Volume();
		Box b =new Box(s1);
		b.Volume();
	}

}
