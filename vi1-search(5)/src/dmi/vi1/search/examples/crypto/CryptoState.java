package dmi.vi1.search.examples.crypto;

public class CryptoState {

    private int rsd;
    private int coin;
    private int day;
    
    
    public static int[] prices = {
			5,6,9,12,15,14,15,9,5,5
	};
	
	
	public int getPriceForDay(int day) {
		return prices[day-1];
	}
    
	public CryptoState(int rsd, int coin, int day) {
		this.rsd = rsd;
		this.coin = coin;
		this.day = day;
	}


	public int getRsd() {
		return rsd;
	}


	public void setRsd(int rsd) {
		this.rsd = rsd;
	}


	public int getCoin() {
		return coin;
	}


	public void setCoin(int coin) {
		this.coin = coin;
	}


	public int getDay() {
		return day;
	}


	public void setDay(int day) {
		this.day = day;
	}


	@Override
	public String toString() {
		return "CryptoState [rsd=" + rsd + ", coin=" + coin + ", day=" + day + "]";
	}
    
    
    
	
	
}
