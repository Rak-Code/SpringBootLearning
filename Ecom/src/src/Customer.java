package src;

public  class Customer implements PaymentProcess{
	int id;
	String name;
	String phoneNumber;
	Wallet wallet;
	
	
	public Customer(int id, String name, String phoneNumber, Wallet wallet) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.wallet = wallet;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Wallet getWallet() {
		return wallet;
	}
	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}



	@Override
    public double generateTotal(Orders order, double shippingCharge, double discountAmt) {
        double orderTotal = 0;

        
        for (OrderDetails details : order.getOrderDetails()) {
            orderTotal += details.getProduct().getPrice() * details.getQuantity();
        }

     
        orderTotal += shippingCharge;
        orderTotal -= discountAmt;

        return orderTotal;
    }

    @Override
    public boolean makePayment(Wallet wallet, double amt) {
        if (wallet.getBalance() >= amt) {
            wallet.setBalance(wallet.getBalance() - amt); 
            return true;
        }
        return false; 
    }
	    
	
	
	
	
	

}
