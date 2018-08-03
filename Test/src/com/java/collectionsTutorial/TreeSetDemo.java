package com.java.collectionsTutorial;
//first the elements are sorted in ascending order

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add("A");
		t.add("a");
		t.add("B");
		t.add("b");
		t.add("C");
		t.add("c");
		/*t.add(10);
		 * Here we will get classcastexception,because we are trying 
		   to add integer object to the string set.	
		*/
		System.out.println(t);
		System.out.println("The first element of the set is ");
		System.out.println(t.first());
		System.out.println("The last element of the set is ");
		System.out.println(t.last());
		System.out.println("This is the head set ");
		System.out.println(t.headSet("b"));
		System.out.println("This is the tail set");	//includes the argu,ent object
		System.out.println(t.tailSet("b"));
		System.out.println("This is the subset ");  //includes the first argument object but not the last one
		System.out.println(t.subSet("b","c"));
	}

}
