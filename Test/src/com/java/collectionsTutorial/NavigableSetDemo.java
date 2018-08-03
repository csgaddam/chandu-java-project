package com.java.collectionsTutorial;

import java.util.TreeSet;

public class NavigableSetDemo {
	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(6000);
		t.add(2000);
		t.add(3000);
		t.add(4000);
		t.add(5000);
		System.out.println(t);
		System.out.println("The head element of the set is:"+t.pollFirst());
		System.out.println("The tail element of the set is:"+t.pollLast());
		System.out.println(t.lower(2000));
		System.out.println(t.higher(4000));
		System.out.println(t.floor(3000));
		System.out.println(t.ceiling(4000));
	}

}
