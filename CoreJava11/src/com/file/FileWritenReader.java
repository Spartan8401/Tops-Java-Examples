package com.file;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritenReader {
	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("tops2.txt");
		String s="This is the java file.";
		fw.write(s);
		fw.flush();
		fw.close();
		System.out.println("Data Writen Succecfuly");
		
		FileReader fr =new FileReader("tops2.txt");
		int i;
		while((i=fr.read())!=-1) {
			System.out.print((char)i);
		}
		fr.close();
	}

}
