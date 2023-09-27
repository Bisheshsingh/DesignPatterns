package org.design.patterns.AbstractFactory.Models;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import org.design.patterns.AbstractFactory.Constants.AbstractFactoryModule;

public class GuiceConfig {
    private static GuiceConfig config;
    private static Injector injector;

    public GuiceConfig(final Module module) {
        injector = Guice.createInjector(module);
    }

    public static <T> T getInstance(Class<T> clazz) {
        if (config == null) {
            config = new GuiceConfig(new AbstractFactoryModule());
        }

        return injector.getInstance(clazz);
    }
}
