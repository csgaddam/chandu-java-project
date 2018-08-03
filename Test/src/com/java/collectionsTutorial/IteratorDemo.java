package com.java.collectionsTutorial;

import java.util.ListIterator;
import java.util.Vector;


public class IteratorDemo {
	public static void main(String[] args) {
		Vector v = new Vector();
		for(int i=0;i<10;i++) {
			v.add(i);
		}
		System.out.println(v);
		ListIterator ltr = v.listIterator();
		while(ltr.hasNext()) {
			Integer I = (Integer)ltr.next();
			if(I%2 == 0) {
				System.out.print(I);
			}else {
				ltr.remove();
			}
		}
		System.out.println(v);
	}

}
