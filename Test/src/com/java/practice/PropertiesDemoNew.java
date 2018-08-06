package com.java.practice;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemoNew {
	public static void main(String[] args) throws Exception {
		Properties p = new Properties();
		p.setProperty("user", "chandra");
		p.setProperty("password", "chandu123");
		p.setProperty("emial","csgaddam04@gmail.com");
		p.store(new FileWriter("C:\\Users\\cgadd\\OneDrive\\Desktop\\javaFile\\values.txt"),"updated by chandra");
		p.load(new FileReader("C:\\Users\\cgadd\\OneDrive\\Desktop\\javaFile\\values.txt"));
		String s1 = p.getProperty("user");
		String s2 = p.getProperty("password");
		System.out.println(s1+" "+s2);
	}

}
