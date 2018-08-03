package com.java.FileInputOutput;

import java.io.File;
import java.io.FileOutputStream;

public class FileOutputStreamDemo {
	public static void main(String[] args) throws Exception  {
		File f = new File("C:\\Users\\cgadd\\OneDrive\\Desktop\\javaFile","file1.txt");
		
		FileOutputStream fos = new FileOutputStream(f);
		String s = "Hello this is written using file output stream";
		byte[] b = s.getBytes();
		fos.write(b);
		fos.close();
	}
}
