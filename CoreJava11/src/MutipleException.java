import java.util.InputMismatchException;
import java.util.Scanner;
public class MutipleException {
	public static void main(String[] args) {	
	int a,b,c;
	System.out.println("Start Code");
	Scanner sc = new Scanner(System.in);
	try
	{
	System.out.println("ENter the value of A:");
	a = sc.nextInt();
	System.out.println("ENter the value of B:");
	b = sc.nextInt();
	
	c = a/b;
	
	System.out.println("Ans:"+c);
    int arr[]= {1,2,3,4,5};
    System.out.println("ENter Index Number:");
    int index=sc.nextInt();
    System.out.println("Array Element Are:"+arr[index]);
	}
	catch(ArithmeticException e){
		System.out.println("Exception Caught"+e);
	}
	catch(InputMismatchException e) {
		System.out.println("Exception Caught"+e);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Exception Caught"+e);
	}
	System.out.println("End Code");
		
	}
}




