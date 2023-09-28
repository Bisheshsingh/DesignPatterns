package org.design.patterns.FactoryMethod.Activity;

import org.design.patterns.FactoryMethod.Constants.FactoryTypes;
import org.design.patterns.Tools.GuiceConfig;
import org.design.patterns.FactoryMethod.Models.ComputerFactory;
import org.design.patterns.FactoryMethod.Models.FactoryProducer;

public class ComputerFactoryProducer
        implements FactoryProducer<FactoryTypes.ComputerFactoryTypes, ComputerFactory> {

    @Override
    public ComputerFactory build(FactoryTypes.ComputerFactoryTypes type) {
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
