package com.java;

import java.util.ArrayList;

public class A_06_ArrayList {
	public static void main(String[] args) {
			ArrayList<String>  list = new ArrayList<String>();   
			list.add("Arafath");
			list.add("Anver");
			list.add("Aqbar");
			
			System.out.println(list); // [Arafath, Anver, Aqbar]
			
			list.add("Mujahid"); // can add items to an array
			
			System.out.println(list); // [Arafath, Anver, Aqbar]
			 
			list.remove(0); // removes the first item , we can also remove the object 
			System.out.println(list); 
			
			String state = list.get(2);
			System.out.println("The second state is : " + state);
			
			// We can also find an item in the list which means getting the index position from the list 
			int position = list.indexOf("Anver");
			System.out.println("Anver is in the position : " + position);
			
		}
}
