package com.java.FileInputOutput;

import java.io.File;

import java.io.FileInputStream;

public class FileInputStreamDemo {
		public static void main(String[] args) throws Exception  {
			File f = new File("C:\\Users\\cgadd\\OneDrive\\Desktop\\javaFile","file1.txt");
			
			FileInputStream  fis = new FileInputStream(f);
			int i = fis.read();
			while(i != -1) {
				System.out.print((char)i);
				i = fis.read();
				}
			System.out.println("*************************");
			System.out.println(f.getPath());
			System.out.println("************************");
			System.out.println(f.getAbsolutePath());
			System.out.println("************************");
			System.out.println(f.getCanonicalPath());
			fis.close();
		}

	}
