package com.java.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;

public class GenericsDemo {
	public static void main(String[] args) {
		/*
		 * ArrayList l =new ArrayList(); 
		 * l.add(10);	// typecasting is required 
		 * l.add("Chandra"); 
		 * String s =(String)l.get(1); 
		 * System.out.println(s);
		 */

		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(1);
		int i = l.get(1); // typecasting is not required
		System.out.println(i);
		
		
		//Generics with map
		HashMap<Integer,String> h = new HashMap<Integer, String>();
		h.put(100, "chandra");
		h.put(200,"gaddam");
		Set<Map.Entry<Integer,String>> s = h.entrySet();
		Iterator<Map.Entry<Integer,String>> itr = s.iterator();
		while(itr.hasNext()) {
			Object o = itr.next();
			System.out.println(o);
		}
	}
}