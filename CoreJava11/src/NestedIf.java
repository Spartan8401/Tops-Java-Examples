import java.util.Scanner;

public class NestedIf {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the Value of A:");
		a = sc.nextInt();
		System.out.println("ENter the Value of B:");
		b = sc.nextInt();
		System.out.println("ENter the Value of C:");
		c = sc.nextInt();
	    if(a>b) {
	    	if(a>c) {
	    		System.out.println("A Is max");
	  	    	}
	    	else
	    		System.out.println("C is Max");
	    }
	    else {
	    	if(b>c) {
	    	System.out.println("B Is Max");
	    }
	    	else
	    		System.out.println("C Is Max");
	    
	}
	}
}
