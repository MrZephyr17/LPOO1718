package atm;

import java.util.Locale;

public class Deposit extends Transaction{
	
	public Deposit(ATM atm, Session s, Card c, double amount) {
		this.atm = atm;
		session = s;
		card = c;
		this.amount = amount;
	}

	
	public String toString()
	{
		return "Deposit at ATM " + atm.getID() + " (" + atm.getPlace() + 
				", " + atm.getBank() + ") of " + String.format(Locale.US,"%2f", amount);
	}
	
}
