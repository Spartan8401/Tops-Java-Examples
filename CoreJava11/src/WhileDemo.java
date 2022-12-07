import java.util.*;

public class WhileDemo {
	public static void main(String [] args) {
	int n,sum=0;
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of N:");
	n=sc.nextInt();
	while(n>0) {
		sum = sum+n;
		n = n-1;
	}
	System.out.println("Sum :"+sum);
	}
}
