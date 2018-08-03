package com.java.collectionsTutorial;
/*
 * witing the logic to get the objects in the list in the descending order.
 */
import java.util.Comparator;
import java.util.TreeSet;

class Comparator1 implements Comparator {
	public int compare(Object obj1,Object obj2) {
		Integer I1 = (Integer)obj1;
		Integer I2 = (Integer)obj2;
		/*if(I1>I2) {
			return -1;
		}
		else if(I1 < I2) {
			return +1;
		}else {
			return 0;
		}*/
		//Another wway to write the logic to get in descending order
		return I2.compareTo(I1);
	}
}

public class ComprableDemo{
	public static void main(String[] args) {
		Comparator1 c = new Comparator1(); 
		TreeSet t = new TreeSet(c);
		t.add(10);
		t.add(1);
		t.add(15);
		t.add(25);
		t.add(20);
		System.out.println("comparator gives the following output:\n"+t);
		System.out.println("Default comparison operation gives the following output:");
		TreeSet t1 = new TreeSet();
		t1.add(10);
		t1.add(1);
		t1.add(15);
		t1.add(25);
		t1.add(20);
		System.out.println(t1);
		
	}
}
