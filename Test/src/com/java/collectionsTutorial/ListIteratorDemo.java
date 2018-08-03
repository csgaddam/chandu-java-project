package com.java.collectionsTutorial;
//To get the overall indexes in an arryList
import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {
	public static void main(String[] args) {
		ArrayList l= new ArrayList();
		l.add("chandra");
		l.add("Gaddam");
		l.add("Venky");
		l.add("Tom");
		System.out.println(l);				//[chandra,Gaddam,Venky,Tom]
		ListIterator ltr = l.listIterator();
		
	}
}



