package org.design.patterns.Behavioral.ChainOfResponsibility.Models;

import lombok.Getter;

@Getter
public abstract class Handler {
    private Handler nextHandler;

    public Handler setNextHandler(final Handler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }

    public abstract void handle();
}
