package com.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class A_08_iterator {
	public static void main(String[] args) {

		
		ArrayList<String>  list = new ArrayList<String>();   
		list.add("Arafath");
		list.add("Anver");
		list.add("Aqbar");
		System.out.println(list);
		
		// creating an iterator 
		ListIterator<String> listItrator = list.listIterator();
		while (listItrator.hasNext()) {
			String value = listItrator.next();
			System.out.println(value);
		}
		
		
		HashMap<String , String > map = new HashMap<String, String>();
		map.put("Cal", "Califonia");
		map.put("Ore", "Oregon");
		map.put("Wash", "Washington");
		System.out.println(map);
		Set<String> keys = map.keySet();
		
		Iterator<String> iterator = keys.iterator();
		 while (iterator.hasNext()) {
			 String value = iterator.next();
			 System.out.println("The Key is : " + value  + " and the value is : " + map.get(value));
			
		}
		
		
	}
}
