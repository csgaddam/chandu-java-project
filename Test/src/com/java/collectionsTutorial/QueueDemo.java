package com.java.collectionsTutorial;

import java.util.PriorityQueue;

public class QueueDemo {
	public static void main(String[] args) {
		PriorityQueue q = new PriorityQueue();
		// some platforms will not provide support for priority queue
		System.out.println(q.poll());		//to remove the head element and return it
		//System.out.println(q.remove());	//same as poll but throws exception if no element present
		System.out.println(q.peek());		//to get the head element without removing it,returns null if no element preseent
		//System.out.println(q.element());	//same as peek throws exception if no element present
		q.offer("chandra");					//to add object to the queue
		q.offer("sekhar");
		q.offer("gaddam");
		System.out.println(q);
	}
}
