import java.util.Scanner;

public class ThrowException {
	
	public static void demo() {
		int x;
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Enter X value:");
		x =sc.nextInt();
		if(x>0) {
			System.out.println("Squre of :"+(x*x));
		}
		else {
			throw new ArithmeticException("Please Enter Positive Value.");
		}
	
		}	catch(Exception e) {
			System.out.println(e);
			demo();   //loop the nagative value while be print loop will be roated
		}
	}
 public static void main(String[] args) {
	demo();
}
	}
