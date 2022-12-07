import java.util.*;
public class TwoDemmentional {
	 public static void main(String [] args) {
		  int a[][] = new int[3][3];
		  int i,j;
		  Scanner sc =new Scanner(System.in);
		  System.out.println("enter the array Element");
		  for(i=0;i<a.length;i++) {
			 for(j=0;j<a.length;j++) { 
			  System.out.println("Enter "+i+" Row & "+j+" Colume :");
			  a[i][j]= sc.nextInt();
		  }
		  }
		  System.out.println("enter the 2array Element");
		  for(i=0;i<a.length;i++) {
			 for(j=0;j<a.length;j++) {  
			 // System.out.println("A["+i+"]["+j+"] ="+a[i][j]);
			  System.out.print(""+a[i][j]);
		  }
			 System.out.println();
	  }
	 }
}
