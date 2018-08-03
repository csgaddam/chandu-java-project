package com.java.collectionsTutorial;

import java.util.HashSet;
import java.util.LinkedHashSet;
/*
	Differencce between HashSet and LinkedHashSet
*/
public class HashSetDemo {
	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add("B");
		h.add("Z");
		h.add("C");
		h.add(null);
		System.out.println(h.add(null));		//Duplicates not allowed
		System.out.println(h);					//insertion order is not preserved
		
		LinkedHashSet lh = new LinkedHashSet();
		lh.add("B");
		lh.add("Z");
		lh.add("C");
		lh.add(null);
		System.out.println(lh.add(null));		//Duplicates not allowed
		System.out.println(lh);					//insertion order is preserved		
		}
}
