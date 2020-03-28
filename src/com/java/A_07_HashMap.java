package com.java;

import java.util.HashMap;

public class A_07_HashMap {

	public static void main(String[] args) {
			HashMap<String , String > map = new HashMap<String, String>();
			
			map.put("Cal", "Califonia");
			map.put("Ore", "Oregon");
			map.put("Wash", "Washington");
			
			System.out.println(map);
			
			map.put("Ala", "Alaska");
			
			String cap  = map.get("Ore");
			System.out.println(cap);
			
			map.remove("Cal");
			System.out.println(map);
	}

}
