package com.Practical;

 public class Member {
	public int id;
	public String Name;
	public int age;
	public int PhoneNumber;
    public String Address;
    public int Salary;
    
  public Member(int id, String Name, int age, int PhoneNumber, String Address, int Salary){
    	this.id=id;
    	this.Name=Name;
    	this.age=age;
    	this.PhoneNumber=PhoneNumber;
    	this.Address=Address;
    	this.Salary=Salary;
        	
    }
  void printMemberDetails() {
	    System.out.println("Employee ID     :  " + id);
	    System.out.println("Employee Name   :  " + Name);
	    System.out.println("Employee Age    :  " + age);
	    System.out.println("EMployee PhoneNumber   :"+PhoneNumber);
	    System.out.println("EMployee Address   :"+Address);
	    System.out.println("Employee Salary :  " + Salary);
	  }



	public static void main(String[] args) {
	    Member emp = new Member(101, "Savas Akhtan", 32,632587412, "Ahmedabad", 22340);
	    emp.printMemberDetails();
	  }

	
}