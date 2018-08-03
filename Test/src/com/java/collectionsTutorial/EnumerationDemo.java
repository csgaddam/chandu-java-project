package com.java.collectionsTutorial;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
	public static void main(String[] args) {
		Vector v = new Vector();
		for(int i=0; i<=10 ;i++) {
			v.addElement(i);
		}
		System.out.print(v);
		System.out.println('\n');
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			Integer I = (Integer)e.nextElement();
			if(I%2 == 0) {
				System.out.print(I);
				System.out.print("  ");
			}
		}
	}

}

