package org.design.patterns.Behavioral.ChainOfResponsibility.Models;

public abstract class Handler {
    private Handler nextHandler;

    public Handler setNextHandler(final Handler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }

    public Handler getNextHandler() {
        return nextHandler;
    }

    public abstract void handle();
}
