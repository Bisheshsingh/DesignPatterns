package org.design.patterns.Tools;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

public class GuiceConfig {
    private static GuiceConfig config;
    private static Injector injector;

    public GuiceConfig() {
        this(binder -> {
        });
    }

    public GuiceConfig(final Module module) {
        injector = Guice.createInjector(module);
    }

    public static <T> T getInstance(Class<T> clazz) {
        if (config == null) {
            config = new GuiceConfig();
        }

        return injector.getInstance(clazz);
    }

    public static GuiceConfig init(final Module module) {
        if (config == null) {
            config = new GuiceConfig(module);
        } else {
            injector = Guice.createInjector(module);
        }

        return config;
    }

    public static Injector getInjector() {
        if (config == null) {
            config = new GuiceConfig();
        }

        return injector;
    }
}
