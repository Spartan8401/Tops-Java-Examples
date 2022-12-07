import java.util.*;
public class ExceptionDemo {
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
	catch(Exception e){
		System.out.println("Exception caught"+e);
	}
	System.out.println("End Code");
		
	}
}
