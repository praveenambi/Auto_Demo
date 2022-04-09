package com.linnklist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkListConcepts {

	public static void main(String[] args) {
		
		LinkedList<String> Linklst = new LinkedList<String>();
		
		Linklst.add("Bengaluru");
		Linklst.add("Delhi");
		Linklst.add("Hyderabad");
		Linklst.add("Chennai");
		Linklst.add("Hubli");
		Linklst.add("Mumbai");
		Linklst.add("Pune");
		Linklst.add("Kashi");
		Linklst.add("Mysore");
		Linklst.add("Bengaluru");
		
		System.out.println("Linklist contents : "  +  Linklst);
		
		
		Linklst.addFirst("Mangalore");
		Linklst.addLast("Udupi");
		
		System.out.println("Linklist contents : "  +  Linklst);
		
		
		Linklst.add(5, "Kochi");
		
		System.out.println("Linklist contents : "  +  Linklst);

		//iterate using  iterator
		
	Iterator<String>	it = Linklst.listIterator();
	
	while (it.hasNext()) {
		
		
		System.out.println(it.next());
		
	}
		
		
		
	}

}
