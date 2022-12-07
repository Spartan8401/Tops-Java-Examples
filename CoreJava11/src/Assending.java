import java.util.Scanner;

public class Assending {
	public static void main(String [] args) {
		  int a[] = new int[5];
		  int i,j,temp;
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
		  
		  for(i=0;i<a.length;i++) {
			  for(j=i+1;j<a.length;j++) {
				 if(a[i]>a[j]){ 
				  temp = a[i];
				  a[i]=a[j];
				  a[j]=temp;
			  }
		  }
		  }
	System.out.println("The assending order of the array:");
	 for(i=0;i<a.length;i++) {
		 System.out.println("A["+i+"] ="+a[i]);
	 }
}
}