package com.java.practice;

class Outer{
	class Inner{
		public void m1() {
			System.out.println("This is outer method");
		}
	}
}

public class InnerClassDemo {
	public static void main(String[] args) {
		
		//new Outer().new Inner().m1();	
		
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		i.m1();
	}
}
