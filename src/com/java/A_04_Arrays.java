package com.java;

import javax.lang.model.util.SimpleAnnotationValueVisitor6;

public class A_04_Arrays {
	public static void main(String[] args) {
		// simple array

		int[] al = new int[3];
		for (int i = 0; i < al.length; i++) {
			System.out.print(al[i]);
		}// outputs a default value of zero 

		int a2[] = new int[3]; // [] place here also does the same
		for (int i = 0; i < a2.length; i++) {
			System.out.println(a2[i]);
		} // outputs a default value of zero 
		
		
		// now initailizing the values 
		int a3 [] = {3,6,9};
		for (int i = 0; i < a3.length; i++) {
			System.out.println(a3[i]);
		}
		
		System.out.println("The Array of the first item is " + a3[0]);

	}
}
