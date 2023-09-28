package org.design.patterns.Modules;

import com.google.inject.AbstractModule;
import org.design.patterns.AbstractFactory.Activity.CPUFactory;
import org.design.patterns.AbstractFactory.Activity.GPUFactory;
import org.design.patterns.AbstractFactory.Activity.RAMFactory;
import org.design.patterns.AbstractFactory.Activity.StorageFactory;
import org.design.patterns.AbstractFactory.Models.CPUAbstractFactory;
import org.design.patterns.AbstractFactory.Models.GPUAbstractFactory;
import org.design.patterns.AbstractFactory.Models.RAMAbstractFactory;
import org.design.patterns.AbstractFactory.Models.StorageAbstractFactory;

public class AbstractFactoryModule extends AbstractModule {
    @Override
    public void configure() {
        bind(CPUAbstractFactory.class).to(CPUFactory.class);
        bind(GPUAbstractFactory.class).to(GPUFactory.class);
        bind(RAMAbstractFactory.class).to(RAMFactory.class);
        bind(StorageAbstractFactory.class).to(StorageFactory.class);
    }
}
