package com.java.assignments;
import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListDuplicates {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(8);
		l.add(9);
		l.add(10);
		l.add(12);
		l.add(13);
		ListIterator<Integer> itr = l.listIterator();
		while(itr.hasNext()) {
			Integer i = (Integer)itr.next();
			int i1 = l.indexOf(i);
			int i2 = l.lastIndexOf(i);
			if(i1 != i2) {
				System.out.println("The ArrayList contains duplicates");
				break;
			}
		}
		System.out.println("The ArrayList doesnot contain any duplicates");
	}
}
