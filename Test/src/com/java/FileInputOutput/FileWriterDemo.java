package com.java.FileInputOutput;
import java.io.*;

public class FileWriterDemo {
	public static void main(String[] args)throws IOException {
		File f = new File("C:\\Users\\cgadd\\OneDrive\\Desktop\\javaFile","file3.txt");
		FileWriter fw = new FileWriter(f);
		fw.write("This is writen using file writer");
		fw.close();
		}
}
