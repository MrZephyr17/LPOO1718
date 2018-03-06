package atm;

public class Account {

	String name;
	double balance;
	
	public Account(String n, double b) {
		name = n;
		balance = b;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

}
