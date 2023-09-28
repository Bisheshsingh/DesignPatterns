package org.design.patterns.Modules;

import com.google.inject.AbstractModule;
import org.design.patterns.Creational.AbstractFactory.Activity.FoodFactory;
import org.design.patterns.Creational.AbstractFactory.Models.FoodAbstractFactory;

public class AbstractFactoryModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(FoodAbstractFactory.class).to(FoodFactory.class);
    }
}
