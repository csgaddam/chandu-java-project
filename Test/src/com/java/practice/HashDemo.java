package com.java.practice;
import java.util.Hashtable;

class Temp{
	int i;
	Temp(int i){
		this.i = i;
	}
	public int hashCode(){
		return i;
	}
	public String toString(){
		return i+"";
	}
}


public class HashDemo {
	public static void main(String[] args) {
	Hashtable t = new Hashtable();
	t.put(new Temp(5),"A");
	t.put(new Temp(4),"B");
	t.put(new Temp(7),"C");
	//t.put(100, null);		null is not applicable in hashtable,we will get nullpointerexception 
	System.out.println(t);
	}
}
