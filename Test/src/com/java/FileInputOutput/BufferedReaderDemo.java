package com.java.FileInputOutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\cgadd\\OneDrive\\Desktop\\javaFile","bufferedwriter.txt");
		BufferedReader br = new BufferedReader(new FileReader(f));
		/*
		 * method to read character by character
		 * int i = br.read();
		while(i != -1) {
			System.out.print((char)i);			The return type of read is int so typecast to char.
		i = br.read();
		}*/
		//method to read entire string at a time
		String s = br.readLine();
		while(s != null) {
		System.out.println(s);
		s = br.readLine();
		}
		br.close();
	}

}
