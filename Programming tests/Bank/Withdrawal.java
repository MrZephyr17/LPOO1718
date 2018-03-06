package atm;

import java.util.Locale;

public class Withdrawal extends Transaction{
	
	public Withdrawal(ATM atm, Session s, Card c, double i) {
		this.atm = atm;
		session = s;
		card = c;
		amount = i;
	}
	
	public String toString()
	{
		return "Withdrawal at ATM " + atm.getID() + " (" + atm.getPlace() + 
				", " + atm.getBank() + ") of " + String.format(Locale.US,"%.2f", amount);
	}

}
