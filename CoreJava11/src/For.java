public class For {
   public static void main (String [] args) {
	   int i,j,k;
	   for(i=0;i<=10;i++) {
		   for(k=0;k<10-i;k++) {
			   System.out.print(" ");
		   }
		   for(j=0;j<=i;j++) {
			   System.out.print(" *");
		   }
		   System.out.println();
	   }
   
   
   /*for(i=10;i>=0;i--) {
	   for(k=10-i;k>0;k--) {
		   System.out.print(" ");
	   }
	   for(j=i;j>=0;j--) {
		   System.out.print(" *");
	   }
	   System.out.println();
   }*/

   for(i=9;i>=0;i--) {
	   for(k=0;k<10-i;k++) {
		   System.out.print(" ");
	   }
	   for(j=0;j<=i;j++) {
		   System.out.print(" *");
	   }
	   System.out.println();
   } 
   for(i=0;i<=4;i++) {
	   for(k=0;k<10-i;k++) {
		   System.out.print(" ");
	   }
	   for(j=0;j<=i;j++) {
		   System.out.print(" *");
	   }
	   System.out.println();
   }

}
}
