package atm;

public class ATM {
	
	private int number;
	private String place;
	private String bank;
	
	public ATM(int i, String string, String string2) {
		number = i;
		place = string;
		bank = string2;
	}

	public int getID() {
		return number;
	}
	
	public String getPlace()
	{
		return place;
	}
	
	public String getBank()
	{
		return bank;
	}

	
	public boolean equals(ATM atm2)
	{
		return number == atm2.getID() && place == atm2.getPlace()
				&& bank==atm2.getBank();
	}
}
