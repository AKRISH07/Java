package collections;

public class Bike{
 
	
	public Bike(int mil, String name) {
		this.mil = mil;
		this.name = name;
	}
	private int mil;
	public int getMil() {
		return mil;
	}
	public void setMil(int mil) {
		this.mil = mil;
	}
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Bike [mil=" + mil + ", name=" + name + "]";
	}
	
	
}
