package autowire;

public class Pancard {
	private String panholderName;
	private String panNumber;
	public String getPanholderName() {
		return panholderName;
	}
	public void setPanholderName(String panholderName) {
		this.panholderName = panholderName;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	
	public String toString() {
		return panNumber+" "+panholderName;
	}
}
