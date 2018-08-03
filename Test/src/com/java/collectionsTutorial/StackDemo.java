package com.java.collectionsTutorial;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push("A");
		s.push(10);
		s.push("B");
		System.out.println(s);
		System.out.println("The offset value of A is "+ s.search("A"));
		s.pop();			// to remove the element on the top of the stack
		System.out.println(s);
		System.out.println("The last entered element is "+s.peek());
		System.out.println(s.empty());
		System.out.println("Now the offset value of A is "+s.search("A"));		
		/*search method returns the offset of the element,if that element is not present
		 it returns -1
		*/
		
	}

}
