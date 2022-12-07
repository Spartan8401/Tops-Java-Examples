import java.util.*;
public class DoWhile {
	public static void main(String [] args) {
     int n,sum=0;
     Scanner sc = new Scanner(System.in);
     System.out.println("ENter the value of N:");
     n = sc.nextInt();
     do{
    	sum = sum+n;
    	n = n-1;
    	
     }while(n>0);
     System.out.println("The Ans is:"+sum);
     
}
}