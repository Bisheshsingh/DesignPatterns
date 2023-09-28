package org.design.patterns.FactoryMethod.Models;

public interface Factory<T, U> {
    U build(T type);
}
