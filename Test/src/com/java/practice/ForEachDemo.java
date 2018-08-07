package com.java.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class ForEachDemo {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(11);
		l.add(12);
		l.add(13);
		l.add(14);
		l.add(15);
		System.out.println("Printing using for-each loop");
		for (Integer i : l) {
			System.out.println(i);			//using for each loop
		}
		System.out.println("***********************************");
		System.out.println("Printing using iterator");
		Iterator<Integer> itr = l.iterator();
		while(itr.hasNext()) {
			int i = itr.next();
			System.out.println(i);
		}
	}

}
