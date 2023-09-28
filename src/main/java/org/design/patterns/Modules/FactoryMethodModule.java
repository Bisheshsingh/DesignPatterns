package org.design.patterns.Modules;

import com.google.inject.AbstractModule;
import org.design.patterns.Creational.FactoryMethod.Activity.CPUFactoryImpl;
import org.design.patterns.Creational.FactoryMethod.Activity.GPUFactoryImpl;
import org.design.patterns.Creational.FactoryMethod.Activity.RAMFactoryImpl;
import org.design.patterns.Creational.FactoryMethod.Activity.StorageFactoryImpl;
import org.design.patterns.Creational.FactoryMethod.Models.CPUFactory;
import org.design.patterns.Creational.FactoryMethod.Models.GPUFactory;
import org.design.patterns.Creational.FactoryMethod.Models.RAMFactory;
import org.design.patterns.Creational.FactoryMethod.Models.StorageFactory;

public class FactoryMethodModule extends AbstractModule {
    @Override
    public void configure() {
        bind(CPUFactory.class).to(CPUFactoryImpl.class);
        bind(GPUFactory.class).to(GPUFactoryImpl.class);
        bind(RAMFactory.class).to(RAMFactoryImpl.class);
        bind(StorageFactory.class).to(StorageFactoryImpl.class);
    }
}
