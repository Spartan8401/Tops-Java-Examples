package com.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	int Rollno;
	String Sname;
	double Per;
	public Student(int rollno, String sname, double per) {
		this.Rollno = rollno;
		this.Sname = sname;
		this.Per = per;
	}
	public String toString(){
		return "Roll No :"+Rollno+"\nStudent Name :"+Sname+"\nPersantage :"+Per;			
	}	
}
public class SerilizationDemo {
	public static void main(String[] args) throws Exception {
		Student s1 =new Student(1,"Piyush",90);
		FileOutputStream fos = new FileOutputStream("Ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.flush();
		oos.close();
		System.out.println("Object writen Succesfully");
		
				
		FileInputStream fis =new FileInputStream("Ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student s2 = (Student) ois.readObject();
		ois.close();
		System.out.println(s2);
	}

}
