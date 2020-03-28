package programms.InstanceVariable_02;

public class Kalamata extends Olive {
	public Kalamata() {
		super(2);
		this.name = "Kalamata";
		this.flavor = "Grassy";
		this.color = Olive.BLACK;
	}

	@Override
	public int crush() {
		System.out.println("Crush from sub class");
		return super.crush();
	} 
	
	
	public String getOrigin () {
		return "Greece";
	}

}
