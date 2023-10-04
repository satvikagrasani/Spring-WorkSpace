package in.mindcraft;

public class Detail {
	
	private String Name;
	private String Email;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	public Detail(String name, String email) {
		Name = name;
		Email = email;
	}
	@Override
	public String toString() {
		return "Detail [Name=" + Name + ", Email=" + Email + "]";
	}
	
	
	
}
