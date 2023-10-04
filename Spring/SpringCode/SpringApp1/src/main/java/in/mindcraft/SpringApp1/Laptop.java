package in.mindcraft.SpringApp1;

public class Laptop {
	private String make;

	public Laptop() {
		
	}
	
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}
	
	
	public void display() {
		System.out.println("Laptop given: "+make);
	}
	
}
