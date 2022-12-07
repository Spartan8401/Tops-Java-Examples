import java.util.*;
public class ArrayDemo {
  public static void main(String [] args) {
	  int a[] = new int[5];//5 is how many element in array
	  int i;
	  Scanner sc =new Scanner(System.in);
	  System.out.println("enter the array Element");
	  for(i=0;i<a.length;i++) {
		  System.out.println("Enter "+(i+1)+ " Elenemt :");
		  a[i]= sc.nextInt();
	  }
	  System.out.println("enter the array Element");
	  for(i=0;i<a.length;i++) {
		  System.out.println("A["+i+"] ="+a[i]);
	  }
  }
}
