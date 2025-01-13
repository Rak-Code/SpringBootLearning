package src;

public class OrderDetails {
	
	Products product;
	Customer customer;
	int quantity;
	public OrderDetails(Products product, Customer customer, int quantity) {
		super();
		this.product = product;
		this.customer = customer;
		this.quantity = quantity;
	}
	
	
	public Products getProduct() {
		return product;
	}

	public Customer getCustomer() {
		return customer;
	}

	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "OrderDetails [product=" + product + ", customer=" + customer + ", quantity=" + quantity + "]";
	}
	
	
	

}
