package com.java.FileInputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		//File f = new File();
		FileReader fr = new FileReader("C:\\Users\\cgadd\\OneDrive\\Desktop\\javaFile\\Collections.txt");
		int i = fr.read();
		while (i != -1) {
			System.out.print((char) i);
			i = fr.read();
		}
	}

}
