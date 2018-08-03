package com.java.FileInputOutput;
import java.io.*;

public class FileCreation {
	public static void main(String[] args)throws Exception {
		
		/*
		//to create a new file
		File f = new File("file1.txt");
		f.createNewFile();
		System.out.println("method to check whether a new file created or not");
		System.out.println(f.exists());
		*/
		
		
		/*//to create a new directory
		File f = new File("file2");
		f.mkdir();
		System.out.println("Is this a file");
		System.out.println(f.isDirectory());
		System.out.println("Is this a diretory: ");
		System.out.println(f.isDirectory());*/	
		
		
		
		/*//to create a new file in the specified directory
		File f = new File("C:\\Users\\cgadd\\OneDrive\\Desktop\\javaFile","file2.txt");
		f.createNewFile();
		System.out.println("Is this a file: ");
		System.out.println(f.isFile());
		System.out.println("Is this a directory: ");
		System.out.println(f.isDirectory());*/
		
		/*//to delete a file 
		File f = new File("C:\\Users\\cgadd\\OneDrive\\Desktop\\javaFile","file2.txt");
		f.delete();
		System.out.println(f.exists());*/
		
		/*File f = new File("C:\\Users\\cgadd\\eclipse-workspace\\Test\\src");
		String[] s = f.list();
		for(String s1 : s) {
			File f1 = new File(f,s1);
			if(f1.isFile()) {
				System.out.println(s1);
				
			}
		}*/
		
		
		File f = new File("C:\\Users\\cgadd\\OneDrive\\Desktop\\javaFile","File.txt");
		f.createNewFile();
		long l = f.length();
		System.out.println(l);
	}
}



	
	
	
	
	
	
	
	
	
	
	
	