package src;

public interface PaymentProcess {
	
	
	double generateTotal(Orders order,double shippingCharge,double discountAmt);
	boolean makePayment(Wallet wallet,double amt);

}
