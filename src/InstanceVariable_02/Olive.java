package InstanceVariable_02;

public class Olive {
	public static final long BLACK = 0x000000;
	public static final long GREEN = 0x00FF00;
	
	public String name = "kalamata";
	public String flavor = "Grassy";
	public long color = Olive.BLACK; 
	private int oil = 3;
		 
	public int getOil() {
		return oil;
	} 

	public void setOil(int oil) {
		this.oil = oil;
	}

	public Olive() {
		System.out.println("Constructor of " + this.name); 
	}
	
	public Olive( int oil) {
		// super(); call the constructor method of the super class, it works with inheritance 
		 setOil(oil);	
	}

	public int crush() {
    	//System.out.println("Ouch!!!");
		System.out.println("Crush from super class");
    	return oil;
    }
 
}
