package com.java.collectionsTutorial;

import java.util.Vector;

public class VectroDemo1 {
	public static void main(String[] args) {
		Vector v = new Vector();
		//Vector v = new Vector(20)    specify the initial capacity
		//Vector v = new Vector(20,5)  specify initial capacity and incremental capacity
		System.out.println(v.capacity());
		for(int i=0;i<10;i++) {
			v.addElement(i);
		}
		v.addElement("a");
		System.out.println(v);
		System.out.println(v.capacity());
	}

}
