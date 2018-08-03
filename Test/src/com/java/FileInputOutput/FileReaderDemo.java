package com.java.FileInputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\cgadd\\OneDrive\\Desktop\\javaFile","Collections.txt");
		FileReader fr = new FileReader(f);
		int i =fr.read();
		while(i != -1) {
			System.out.print((char)i);
			i = fr.read();
		}
	}

}
