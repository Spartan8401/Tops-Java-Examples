import java.util.*;
public class SwitchDemo {
 public static void main(String[] args) {
	 int A,B,C,D;
	 boolean flag = true;
	 Scanner sc = new Scanner(System.in);
	 do {
		 System.out.println("Enter the A Value:");
		 A = sc.nextInt();
		 System.out.println("Enter the B Value:");
		 B = sc.nextInt();
		 
		 System.out.println("1. Addition");
		 System.out.println("2. Subtraction");
		 System.out.println("3. Multiplication");
		 System.out.println("4. Division");
		 System.out.println("5. Exit");
         
		 System.out.println("Enter Your Choice");
		 D = sc.nextInt();
		 switch(D){
			 case 1:
			      C = A+B;
			      System.out.println("The Ans is" +C);
			      break;
			  
			 case 2:
		      C = A-B;
		      System.out.println("The Ans is" +C);
		      break;
		      
			 case 3:
		      C = A*B;
		      System.out.println("The Ans is" +C);
		      break;
		      
			 case 4:
		      C = A/B;
		      System.out.println("The Ans is" +C);
		      break;
			 case 5:
				 flag = false;
				 break;
			 default :
				 System.out.println("Invalid Choice");
				 break;
				 				 			 
		 }
	 }while(flag);
 }
	
}
