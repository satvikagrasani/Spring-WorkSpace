package in.mindcraft.SpringApp;

public class Laptop {
	private int Lid;
	private String Make;
	private double cost;
	
	public Laptop() {
		Lid = 1;
		Make = "abc";
		cost = 100000;
	}
	
	public Laptop(int ID,String M,double C) {
		Lid = ID;
		Make = M;
		cost = C;
	}
	
//	Getter Setters
	public int getLid() {
		return Lid;
	}
	public void setLid(int lid) {
		Lid = lid;
	}
	public String getMake() {
		return Make;
	}
	public void setMake(String make) {
		Make = make;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public void show() {
		System.out.println(Lid+" "+Make+" "+cost);
	}
	
	
}
