package com.java.collectionsTutorial;

import java.util.ArrayList;
import java.util.LinkedList;


//comment
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();//the default arraylist,size is 10
		//ArrayList l = new ArrayList(int initialSize);   size of the arraylist is specified
		//ArryList l = new  Arraylist(Collection c);	  to convert any other collection object to arraylist
		System.out.println(l instanceof ArrayList);
		l.add("A");
		l.add(10);
		l.add("A");
		l.add(null);
		System.out.println(l);	//[A,10,A,null]
		System.out.println("************************");
		l.remove(2);
		l.add(2,"M");
		l.add("N");
		System.out.println(l);	//[A,10,M,null,N]
		//System.out.println(l.size());
	}

}
