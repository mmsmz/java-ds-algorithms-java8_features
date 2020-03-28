package com.java;

import java.net.URI;
import java.net.URISyntaxException;

public class A_03_Debugger {

	public static void main(String[] args) {

		try {
			URI uri = new URI("http://google.com");
		} catch (URISyntaxException e) {
		
			System.out.println(e.getMessage());
		}
		
		System.out.println("Working!!");
}
}
