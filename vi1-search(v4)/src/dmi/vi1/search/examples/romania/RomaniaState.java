package dmi.vi1.search.examples.romania;

public class RomaniaState {
	
	private String city;

	public RomaniaState(String city) {
		super();
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "RomaniaState [city=" + city + "]";
	}
	
	

}
