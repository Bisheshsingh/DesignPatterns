package org.design.patterns.AbstractFactory.Activity;

import com.google.inject.Inject;
import org.design.patterns.AbstractFactory.Constants.FactoryTypes.ComputerFactoryTypes;
import org.design.patterns.AbstractFactory.Models.ComputerAbstractFactory;
import org.design.patterns.Modules.AbstractFactoryModule;
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
        GuiceConfig.init(new AbstractFactoryModule());
        GuiceConfig.getInjector().injectMembers(this);
    }

    @Test
    public void gamingPC() {
        final ComputerFactoryTypes type = ComputerFactoryTypes.GAMING;
        final ComputerAbstractFactory factory = factoryProducer.build(type);

        assertNotNull(factory);
        assertTrue(factory instanceof GamingComputerFactory);
    }

    @Test
    public void officePC() {
        final ComputerFactoryTypes type = ComputerFactoryTypes.OFFICE;
        final ComputerAbstractFactory factory = factoryProducer.build(type);

        assertNotNull(factory);
        assertTrue(factory instanceof OfficeComputerFactory);
    }

    @Test
    public void serverPC() {
        final ComputerFactoryTypes type = ComputerFactoryTypes.SERVER;
        final ComputerAbstractFactory factory = factoryProducer.build(type);

        assertNotNull(factory);
        assertTrue(factory instanceof ServerComputerFactory);
    }
}