package byType;

public class Pancard {
	private String panholderName,panNumber;

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
