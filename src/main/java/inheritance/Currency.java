package inheritance;

public class Currency {
	
	double value;
	String name;
	
	public Currency (double value, String name) {
		this.value = value;
		this.name = name;
	}
	
	public double get_value() {return value;}
	public String get_name() { return name;}
	
	public void set_value(int value) {
		this.value = value;
	}
	public void set_name(String name) {
		this.name= name;
	}
	

}
