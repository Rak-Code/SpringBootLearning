package src;

import java.util.List;

public class Orders {
	int id;
	Customer customer;
	List<OrderDetails> orderDetails;
	public Orders(int id, Customer customer, List<OrderDetails> orderDetails) {
		super();
		this.id = id;
		this.customer = customer;
		this.orderDetails = orderDetails;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<OrderDetails> getOrderDetails() {
		return orderDetails;
	}
	public void setOrderDetails(List<OrderDetails> orderDetails) {
		this.orderDetails = orderDetails;
	}
	@Override
	public String toString() {
		return "Orders [id=" + id + ", customer=" + customer + ", orderDetails=" + orderDetails + "]";
	}
	
	

}
