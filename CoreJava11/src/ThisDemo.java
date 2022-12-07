class Student{
	int rno =25;
	String sname;
	public Student() {
		System.out.println("Default Constructer called");
	}
	
	public Student(int rno,String sname) {
		this();      //Default Constructor called. 
		this.rno =rno;    //This Class rno and sname called.
		this.sname= sname;
		
	}
	void display(Student s) {
		System.out.println("Rno.:"+rno);
		System.out.println("sname:"+sname);
	}
	void show() {
		this.display(this);
	}
}
public class ThisDemo {
	public static void main(String[] args) {
		
	Student s = new Student();
	s.show();
	}
}
