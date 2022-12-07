import java.util.Scanner;

public class IfCondition {
   public static void main(String[] args) {
	int a,b,c;
	Scanner sc = new Scanner(System.in);
	System.out.println("ENter the Value of A:");
	a = sc.nextInt();
	System.out.println("ENter the Value of b:");
	b = sc.nextInt();
    if(a>b) {
    	System.out.println("A is Max");
    }
    else {
    	System.out.println("B is Max");
    }
}
}
