package org.design.patterns.AbstractFactory.Models;

public interface AbstractFactory <T, U> {
    U build(T type);
}
