package dmi.vi1.search.examples.romania;

public class RomanianMapState {

	private String city;

	public RomanianMapState(String city) {
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
		return "RomanianMapState [city=" + city + "]";
	}
	
	
}
