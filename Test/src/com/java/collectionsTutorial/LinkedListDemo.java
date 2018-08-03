package com.java.collectionsTutorial;

import java.util.*;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(10);
		l.add("chandra");
		l.add("null");
		l.add("chandra");
		System.out.println(l);
		l.set(1, "Hello");
		l.removeLast();
		System.out.println(l);
		l.removeFirst();
		System.out.println(l);
	}

}
