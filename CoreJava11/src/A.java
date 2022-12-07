import java.util.Scanner;
class A{
     public static void main(String[] args){
          int i,j,RollNo,Total=0,English,Maths,Physic;
          float Per,Grade;
          String Name;
          String[] array = {"Roll No.", "    Name", "   Endlish","    Maths","      Physic","    Total","      Per", "    Grade"}; 
          
          Scanner st = new Scanner(System.in);
          
          for(i=0;i<2;i++){
                System.out.print("Enter the Roll Number:");
                RollNo = st.nextInt();
                System.out.print("Enter the Name:");
                Name = st.next();
                
       
                Scanner std = new Scanner(System.in);
                System.out.print("Enter the English Marks:");
                English = std.nextInt();
                System.out.print("Enter the MAths Marks:");
                Maths = std.nextInt();
                System.out.print("Enter the Physic Marks:");
                Physic = std.nextInt();
                Total = English+Maths+Physic;
                Per = Total/3;       
               
                for(String x : array){
                        System.out.print(x);
                    
                  }
                
                 System.out.println();
                System.out.println( " "+RollNo + "          " +Name + "    " +English+ "       " +Maths+"          " +Physic +"      " +Total+ "      "+Per );
                if(Per>=85){
                     System.out.print("A");
                     } 
                  else if(Per>=60 && Per<85){
                     System.out.print("B");
                     } 
                 else if(Per>=60 && Per<40){
                     System.out.print("C");
                     } 
                 else{
                     System.out.print("Fail");

                      } 
              } 
            }
       
}