package in.mindcraft.SpringApp1;

public class Address {
	private String city,state;
	private Laptop laptop;
	
	public Address() {
		
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public void display() {
		System.out.println("City: "+city);
		System.out.println("State: "+state);
		laptop.display();
	}
	
	
}
