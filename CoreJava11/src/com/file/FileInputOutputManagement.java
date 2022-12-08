package com.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileInputOutputManagement {
	public static void main(String[] args) throws Exception  {
		FileOutputStream fos=new FileOutputStream("tops1.txt");
		String s = "This Is file management of java.";
		byte b[]=s.getBytes();
		fos.write(b);
		fos.flush();
		fos.close();
		System.out.println("Data Writen Succesfully.");
		
		FileInputStream fis = new FileInputStream("tops1.txt");
		int i;
		while((i=fis.read())!=-1) {
			System.out.print((char)i);
		}
		fis.close();
	}

}
