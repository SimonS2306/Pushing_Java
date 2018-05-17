package inheritance;

public class Pound extends Currency implements Bank {

	int rank;

	public Pound(double value, String name, int rank) {
		super(value, name);
		this.rank = rank;
	}
	
	@Override
	public String toString() {
		return value + " " + name + " " + rank;
	}

	public String get_currency_name() {
		// TODO Auto-generated method stub
		return name;
	}

	public int[] get_ranking() {
		// TODO Auto-generated method stub
		return null;
	}

}
