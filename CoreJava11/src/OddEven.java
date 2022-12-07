import java.util.Scanner;

public class OddEven {
	 public static void main(String[] args) {
			int a,b,c;
			Scanner sc = new Scanner(System.in);
			System.out.println("ENter the Value of A:");
			a = sc.nextInt();
			
		    if(a%2==0) {
		    	System.out.println("A is Even");
		    }
		    else {
		    	System.out.println("A is Odd");
		    }
		}

}
