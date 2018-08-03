package com.java.MapsTutorial;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;



public class HashMapDemo {
	public static void main(String[] args) {
 		
		//how to insert a entry in to the hashmap
		HashMap m = new HashMap();
		//LinkedHashMap m = new LinkedHashMap();	to preserve the insertion order use LinkedHashMap
		m.put(100, "chandra");
		m.put(200,"gaddam");
		m.put(300,"krish");
		m.put(310, null);
		System.out.println(m);
		
		HashMap m1 = new HashMap();
		m1.put(300, "Krishna");
		m1.put(310,"tom");		//this will replace the previous value of key 300
		
		//Method to add a map to hashMAp
		m.putAll(m1);
		System.out.println("The output after inserting duplicate values\n"+m);
		
		//to get the value of the given key
		Object o = m.get(100);
		System.out.println("The value of the given key is:\n"+o);
		
		//to remove the key value pair
		m.remove(100);
		
		//to check if the map is empty
		boolean b = m.isEmpty();
		System.out.println("Is the HashMap empty: "+b);
		
		//to see if the specified key is present
		boolean b1 = m.containsKey(100);
		System.out.println("Does the hashMap contain the given key "+b1);
		
		//to see if the specified value is present
		boolean b3 = m.containsValue("gaddam");
		System.out.println("Does the hashmap contain the given value: "+b3);
		
		//to check the size of the hashmap
		int size = m.size();
		System.out.println("The size of the hashmap is: "+size);
		
		
		//To get the all the keys in the hash set
		Set keys = m.keySet();
		System.out.println(keys);
		
		//To get all the values present in the hashmap
		Collection c = m.values();
		System.out.println(c);
		
		
		//to get the entry objects set
		Set s1 = m.entrySet();
		System.out.println(s1);
		
		Iterator itr = s1.iterator();
		while(itr.hasNext()) {
			Map.Entry me = (Map.Entry)itr.next(); 	//outer.inner class typecasting
			if(me.getValue() == "tom") {
				me.setValue("chandu");
			}
		}
		System.out.println(m);
	}
}
