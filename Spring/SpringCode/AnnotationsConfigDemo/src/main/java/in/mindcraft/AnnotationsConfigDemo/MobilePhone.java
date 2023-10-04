package in.mindcraft.AnnotationsConfigDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype") //singleton and prototype
public class MobilePhone {
	
	private int mid;
	private String make;
	
	@Autowired
	private MemoryCard mcard;
	
	public MobilePhone() {
		System.out.println("Constructor");
		mid = 101;
		make = " Samsung ";
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}
	public MemoryCard getMcard() {
		return mcard;
	}

	public void setMcard(MemoryCard mcard) {
		this.mcard = mcard;
	}

	public void show() {
		System.out.println("ID "+mid+"\nMake "+make);
		mcard.show();
	}
	
}
