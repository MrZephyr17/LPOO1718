package atm;

public abstract class Transaction {
	
	protected ATM atm;
	protected Session session;
	protected Card card;
	protected double amount;
	
	public double getAmount() {
		return amount;
	}

	public void setAmount(double d) {
		amount = d;	
	}
}
