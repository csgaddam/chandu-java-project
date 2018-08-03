package com.java.collectionsTutorial;
import java.util.Comparator;
import java.util.TreeSet;
/*
 	if we are using string buffer objects,default comparison will be ClassCastException because
 	StringBuffer class does not implement comparable interface.so if we want to compare Sb
 	objects then we should use customized comparator,and we should type cast the sb objects to
 	string.
 */

class StringComparator implements Comparator{
	public int compare(Object obj1,Object obj2) {
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		return s2.compareTo(s1);
	}
}


public class ComparableStringDemo {
	public static void main(String[] args) {
		TreeSet t1 = new TreeSet();
		t1.add("Chandra");
		t1.add("chandu");
		t1.add("Gaddaam");
		t1.add("gaddam");
		System.out.println("The default operation is ascending order.");
		System.out.println("The output we get by default is:\n"+t1);

		TreeSet t = new TreeSet(new StringComparator());
		t.add("Chandra");
		t.add("chandu");
		t.add("Gaddaam");
		t.add("gaddam");
		System.out.println("customized operation is descending order.");
		System.out.println("The output we get using customized comparator\n"+t);
	}
}
