import java.util.Scanner;

public class Bank {
  public static void main(String[] args) {
	int Choice;
	long ac;
	double Amount,wd,cr,dt,s1,s2;
	boolean flag=true;
	String sname;
	Scanner sc = new Scanner(System.in);
	do{
	System.out.println(" The Name of Customer:");
	sname = sc.next();
	System.out.println(" The account No.");
	ac = sc.nextLong();
	System.out.println("The Ammount Of Account");
	Amount =sc.nextDouble();
	if(Amount<0) {
		System.out.println("Invalid Amount");
	}
	System.out.println("1.Withdraw Ammount");
	System.out.println("2.Credit Ammount");
	System.out.println("3. Detail Of Account");
	System.out.println("4.Exit");
	System.out.println("Enter your choise:");
	Choice =sc.nextInt();
	switch(Choice) {
	case 1:
		System.out.println("ENter the withdraw amount:");
		s1=sc.nextDouble();
		wd = Amount-s1;
		System.out.println("The Account Amount:"+wd);
		break;
	case 2:
		System.out.println("ENter the Creadit amount:");
		s2=sc.nextDouble();
		cr = Amount+s2;
		System.out.println("The Account Amount:"+cr);
		break;
	case 3:
		System.out.println("ENter the Detail amount:");	
		System.out.println("The Account Amount:"+Amount);
		break;
				
	 case 4:
		 flag = false;
		 break;
		 
	 default :
		 System.out.println("Invalid Choice");
		 break;
		 
	}
	
  }while(true);

}
}
