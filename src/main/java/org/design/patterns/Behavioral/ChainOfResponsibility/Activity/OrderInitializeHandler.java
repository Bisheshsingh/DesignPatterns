package org.design.patterns.Behavioral.ChainOfResponsibility.Activity;

import org.design.patterns.Behavioral.ChainOfResponsibility.Models.Handler;

import java.util.Random;

public class OrderInitializeHandler extends Handler {
    @Override
    public void handle() {
        final Integer id = new Random().nextInt(9000) + 1000;
        System.out.println("Order ID : " + String.valueOf(id));
    }
}
