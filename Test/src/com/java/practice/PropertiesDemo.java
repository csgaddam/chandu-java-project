package com.java.practice;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\Users\\cgadd\\OneDrive\\Desktop\\javaFile\\file1.txt");
		Properties p = new Properties();
		p.load(fr);
		System.out.println(p.getProperty("User"));
		System.out.println(p.getProperty("Password"));
		p.store(new FileWriter("C:\\Users\\cgadd\\OneDrive\\Desktop\\javaFile\\file1.txt"), "This is a new Property");
	}
}