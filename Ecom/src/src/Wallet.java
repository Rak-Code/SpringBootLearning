package src;

public class Wallet {
	int id;
	double balance;
	Customer customer;
	
	
	
	
	public Wallet(int id, double balance, Customer customer) {
		super();
		this.id = id;
		this.balance = balance;
		this.customer = customer;
	}
	public int getId() {
		return id;
	}
//	public void setId(int id) {
//		this.id = id;
//	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Customer getCustomer() {
		return customer;
	}
	
	
	
//	public void setCustomer(Customer customer) {
//		this.customer = customer;
//	}
	
	

}
