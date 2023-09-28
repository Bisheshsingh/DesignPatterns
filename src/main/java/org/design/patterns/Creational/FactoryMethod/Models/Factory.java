package org.design.patterns.Creational.FactoryMethod.Models;

public interface Factory<T, U> {
    U build(T type);
}
