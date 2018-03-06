package atm;

import java.util.ArrayList;

public class Session extends Countable {
	
	private ATM atm;
	
	public Session(ATM atm) {
		this.atm = atm;
		transactions = new ArrayList<Transaction>();
	}

	public ATM getATM() {
		return atm;
	}

	public void addTransaction(Transaction t) {
		transactions.add(t);
	}
	
	public boolean equals(Session s2)
	{
		return atm.equals(s2.atm);
	}
}
