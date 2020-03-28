package programms.InstanceVariable_02;

import java.util.ArrayList;

public class Main {
	//static means this is a class method , it can be called by the class definition 
	// if you dont use the keyword static you can call the instance method. 
	public static void main(String[] args) {
			
 		ArrayList<Olive> olives  = new ArrayList<Olive>();
		
 		Olive olive; // i am declaring it once because i can reuse the reference three times.
 		
		olive = new Kalamata();
		System.out.println(olive.name);
		olives.add(olive);
		 
		olive = new Ligurian();
		System.out.println(olive.name);
		olives.add(olive);
		
		olive = new Kalamata(); 
		System.out.println(olive.name);
		olives.add(olive);
	
		OlivePress press = new OlivePress();
		press.getOil(olives);
		System.out.println("You have got " + press.getTotalOil() + " units of oil");
	
		press.getOil(olives);
		System.out.println("You have got " + press.getTotalOil() + " units of oil");
		
		//Kalamata olive1 = olives.get(0); // downward casting 
		Kalamata olive1 = (Kalamata) olives.get(0);
		System.out.println("Olive 1 is from " + olive1.getOrigin()); 
	}
}
