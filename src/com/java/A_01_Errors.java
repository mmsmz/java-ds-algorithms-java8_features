package com.java;

public class A_01_Errors {

	public static void main(String[] args) {
			
//		String s = null;
//		System.out.println(s);
		
		/*try {
			String[] strings = {"Welcome!!"};
			System.out.println(strings[1]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("There is an error");
		}
		System.out.println("The applications is still running!!");*/
		
		//-------------------------------------------------------------------
	
		
		try {
			getArrayItem();
		} catch (Exception e) {
			// TODO Auto-generated catch block
		System.out.println("Array out of bounds");
		}
		
	}

	private static void getArrayItem() throws ArrayIndexOutOfBoundsException{
		String[] strings = {"Welcome!!"};
		System.out.println(strings[1]);
	}
}
