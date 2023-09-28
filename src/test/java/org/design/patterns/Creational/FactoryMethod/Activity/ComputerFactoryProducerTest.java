package org.design.patterns.Creational.FactoryMethod.Activity;

import com.google.inject.Inject;
import org.design.patterns.Creational.FactoryMethod.Constants.FactoryTypes.ComputerFactoryTypes;
import org.design.patterns.Creational.FactoryMethod.Models.ComputerFactory;
import org.design.patterns.Modules.FactoryMethodModule;
import org.design.patterns.Tools.GuiceConfig;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ComputerFactoryProducerTest {
    @Inject
    private ComputerFactoryProducer factoryProducer;

    @BeforeEach
    void setUp() {
        GuiceConfig.init(new FactoryMethodModule());
        GuiceConfig.getInjector().injectMembers(this);
    }

    @Test
    public void gamingPC() {
        final ComputerFactoryTypes type = ComputerFactoryTypes.GAMING;
        final ComputerFactory factory = factoryProducer.build(type);

        assertNotNull(factory);
        assertTrue(factory instanceof GamingComputerFactory);
    }

    @Test
    public void officePC() {
        final ComputerFactoryTypes type = ComputerFactoryTypes.OFFICE;
        final ComputerFactory factory = factoryProducer.build(type);

        assertNotNull(factory);
        assertTrue(factory instanceof OfficeComputerFactory);
    }

    @Test
    public void serverPC() {
        final ComputerFactoryTypes type = ComputerFactoryTypes.SERVER;
        final ComputerFactory factory = factoryProducer.build(type);

        assertNotNull(factory);
        assertTrue(factory instanceof ServerComputerFactory);
    }
}