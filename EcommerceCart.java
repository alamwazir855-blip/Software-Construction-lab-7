package com.mycompany.lab07;

public class EcommerceCart {

    private PaymentMethod paymentMethod;

    public EcommerceCart(PaymentMethod paymentMethod) {

        this.paymentMethod = paymentMethod;

    }

    public void checkout(double amount) {

        boolean success = paymentMethod.pay(amount);

        if (success) {

            System.out.println("Order placed successfully.");

        } else {

            System.out.println("Payment failed.");

        }
    }
}