package src;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        Products product1 = new Products(1, "Laptop", 1000, 10);
        Products product2 = new Products(2, "Smartphone", 500, 20);

        
        Wallet wallet = new Wallet(1, 99999, null); 

        
        Customer customer = new Customer(1, "Raj Yadav", "1234567890", wallet);
        
      
        wallet = new Wallet(wallet.getId(), wallet.getBalance(), customer);

       
        OrderDetails orderDetails1 = new OrderDetails(product1, customer, 2); 
        OrderDetails orderDetails2 = new OrderDetails(product2, customer, 3);  

      
        Orders order = new Orders(1, customer, Arrays.asList(orderDetails1, orderDetails2));

        
        double shippingCharge = 50; 
        double discountAmt = 100;    
        double totalAmount = customer.generateTotal(order, shippingCharge, discountAmt);
        
        System.out.println("Total Amount: " + totalAmount);

       
        if (customer.makePayment(wallet, totalAmount)) {
            System.out.println("Payment Successful!");
        } else {
            System.out.println("Insufficient Funds!");
        }

      
        System.out.println("Updated Wallet Balance: " + wallet.getBalance());
    }
}
