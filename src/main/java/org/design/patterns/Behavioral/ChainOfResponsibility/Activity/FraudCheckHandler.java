package org.design.patterns.Behavioral.ChainOfResponsibility.Activity;

import org.design.patterns.Behavioral.ChainOfResponsibility.Models.Handler;

public class FraudCheckHandler extends Handler {

    @Override
    public void handle() {
        System.out.println("Order is Fraud : false");
    }
}
