package org.design.patterns.Creational.FactoryMethod.Models;

public interface FactoryProducer<T, U extends Factory<?, ?>> extends Factory<T, U> {
}
