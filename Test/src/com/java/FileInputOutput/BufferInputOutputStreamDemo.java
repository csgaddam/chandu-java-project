package com.java.FileInputOutput;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferInputOutputStreamDemo {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\cgadd\\OneDrive\\Desktop\\javaFile","file2.txt");
		try {
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(f));
		String s = "Hello";
		byte[] b = s.getBytes();
		bos.write(b);
		bos.close();
		}catch(Exception e) {System.out.println(e);}
		
		try {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f));
		int i = bis.read();
		while(i != -1) {
		System.out.println((char)i);
		i = bis.read();
		}
		bis.close();
		
			
		}catch(Exception e) {System.out.println(e);}
	}
}
