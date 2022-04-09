package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class LinkedLists {

	public static void main(String[] args) {
		
		
	LinkedList<Integer> ll = new LinkedList<Integer>(Arrays.asList(3,5,6,6,7,8,5,8));
	
	ll.removeFirstOccurrence(ll.removeLast());

	for (Integer intt : ll) {
		
		
		System.out.println(" " + intt);
		
		
	}
	
	
	
	ArrayList<Integer> arr = new ArrayList<Integer>();
	
	boolean b =  arr.isEmpty();
	arr.add(null);
	System.out.println(b);

	}

}
