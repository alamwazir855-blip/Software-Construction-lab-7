package com.mycompany.lab07;

public class CreditCardPayment implements PaymentMethod {

    @Override
    public boolean pay(double amount) {

        System.out.println(
                "Payment of Rs. " + amount
                + " made using Credit Card."
        );

        return true;
    }
}