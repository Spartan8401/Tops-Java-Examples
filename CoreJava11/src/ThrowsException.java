import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsException {
	public static void demo() throws ArithmeticException,IndexOutOfBoundsException,InputMismatchException
	{
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of X:");
		x =sc.nextInt();
		if(x>0) {
			System.out.println("Squre of:"+(x*x));
		}
		else {
			throw new ArithmeticException("Please enter positive Value");
		}
		
	}
	public static void main(String[] args) {
		try {
			demo();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Finaly block called");
		}
	}

}
