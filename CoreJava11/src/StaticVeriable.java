import java.util.*;
public class StaticVeriable{
   static int a;
	void setValue(){
		Scanner sc =new Scanner(System.in);
		System.out.println("ENter the element of:");
		a =sc.nextInt();
	}
	void putValue(){
		System.out.println("A :"+a);
	}
   public static void main(String[] args) {
	StaticVeriable S1=new StaticVeriable();
	StaticVeriable S2=new StaticVeriable();
	StaticVeriable S3=new StaticVeriable();
	 
	S1.setValue();
	S2.setValue();
	S3.setValue();
	
	S1.putValue();
	S2.putValue();
	S3.putValue();
}
}
