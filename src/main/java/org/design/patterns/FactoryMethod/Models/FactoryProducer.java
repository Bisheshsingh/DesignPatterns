package org.design.patterns.FactoryMethod.Models;

public interface FactoryProducer<T, U extends Factory<?, ?>> extends Factory<T, U> {
}
