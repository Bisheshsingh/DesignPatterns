package org.design.patterns.AbstractFactory.Activity;

import org.design.patterns.AbstractFactory.Constants.FactoryTypes;
import org.design.patterns.AbstractFactory.Models.GuiceConfig;
import org.design.patterns.AbstractFactory.Models.ComputerAbstractFactory;
import org.design.patterns.AbstractFactory.Models.FactoryProducer;

public class ComputerFactoryProducer
        implements FactoryProducer<FactoryTypes.ComputerFactoryTypes, ComputerAbstractFactory> {

    @Override
    public ComputerAbstractFactory build(FactoryTypes.ComputerFactoryTypes type) {
        switch (type) {
            case GAMING:
                return GuiceConfig.getInstance(GamingComputerFactory.class);
            case OFFICE:
                return GuiceConfig.getInstance(OfficeComputerFactory.class);
            case SERVER:
                return GuiceConfig.getInstance(ServerComputerFactory.class);
            default:
                return null;
        }
    }
}
