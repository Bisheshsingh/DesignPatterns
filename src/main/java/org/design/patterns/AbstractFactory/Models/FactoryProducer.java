package org.design.patterns.AbstractFactory.Models;

public interface FactoryProducer<T, U extends AbstractFactory<?, ?>> extends AbstractFactory<T, U> {
}
