package com.mycompany.lab07;

public class JazzCashPayment implements PaymentMethod {

    @Override
    public boolean pay(double amount) {

        System.out.println(
                "Payment of Rs. " + amount
                + " made using JazzCash."
        );

        return true;
    }
}