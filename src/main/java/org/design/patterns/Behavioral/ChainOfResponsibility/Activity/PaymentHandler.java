package org.design.patterns.Behavioral.ChainOfResponsibility.Activity;

import org.design.patterns.Behavioral.ChainOfResponsibility.Models.Handler;

public class PaymentHandler extends Handler {
    @Override
    public void handle() {
        System.out.println("Payment : Successful");
    }
}
