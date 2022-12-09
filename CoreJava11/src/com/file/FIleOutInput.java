package com.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class FIleOutInput {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos=new FileOutputStream("tops3.txt");
        String s ="this is file";
        byte b[]= s.getBytes();
        fos.write(b);
        fos.flush();
        fos.close();
        
        FileInputStream fi =new FileInputStream("tops3.txt");
        int i;
        while((i=fi.read())!=-1) {
        	System.out.print((char)i);
        	
        }
        fi.close();
        
        
        
        
        FileWriter fw =new FileWriter("tops4.txt");
        String s1=" This is Tops4 File";
        fw.write(s1);
        fw.flush();
        fw.close();
        
        
        FileReader fr = new FileReader("tops4.txt");
        int x;
        while((x=fr.read())!=-1) {
        	System.out.print((char)x);
        }
        fr.close();
	}

}
