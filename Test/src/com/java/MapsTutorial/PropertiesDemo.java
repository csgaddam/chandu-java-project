package com.java.MapsTutorial;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args)throws IOException {
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\cgadd\\OneDrive\\Desktop\\javaFile\\properties.txt");
		p.load(fis);
		System.out.println(p.getProperty("user"));
		p.setProperty("mobile", "1234567890");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\cgadd\\OneDrive\\Desktop\\javaFile\\properties.txt");
		p.store(fos,"updated by chandra");
	}

}
