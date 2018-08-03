package com.java.FileInputOutput;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\cgadd\\OneDrive\\Desktop\\javaFile","bufferedwriter.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter(f));
		bw.write("This is written using buffered writer");
		bw.newLine();
		bw.write("End of the file");
		bw.flush();
		bw.close();
	
	}

}
