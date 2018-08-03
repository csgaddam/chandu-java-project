package com.java.collectionsTutorial;

import java.util.Comparator;
import java.util.TreeSet;

class Employee implements Comparable{
	int eid;
	String name;
	Employee(int eid,String name){
		this.eid = eid;
		this.name = name;
	}
	
	//while printing this method will be called internally
		public String toString() {
		return name+"--"+eid;
	}
	public int compareTo(Object obj1) {
		int eid1 = this.eid;
		Employee e = (Employee)obj1;
		int eid2 = e.eid;
		if(eid1 < eid2) {
			return -1;
		}
		else if (eid1 > eid2) {
			return +1;
		}
		else {
			return 0;
		}
	}
}




public class EmployeeSortingDemo {
	public static void main(String[] args) {
		Employee e1 = new Employee(100,"chandra");
		Employee e2 = new Employee(101,"sekhar");
		Employee e3 = new Employee(102,"shiva");
		Employee e4 = new Employee(103,"Kiran");
		Employee e5 = new Employee(99,"sam");
		TreeSet t = new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		System.out.println("The ouput using compareTo logic:");
		System.out.println(t);
		/*TreeSet t1 = new TreeSet(new MyComparator());
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		System.out.println("The output using compare logic:");
		System.out.println(t1);*/
		}

}

/*class MyComparator implements Comparator{
	public int compare(Object obj1,Object obj2) {
		Employee e = (Employee)obj1;
		String s1 = e.name;
		Employee e1 = (Employee)obj2;
		String s2 = e1.name;
		return s1.compareTo(s2);
	}
}*/
