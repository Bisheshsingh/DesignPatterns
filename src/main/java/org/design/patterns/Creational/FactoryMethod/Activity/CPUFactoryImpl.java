package org.design.patterns.Creational.FactoryMethod.Activity;

import org.design.patterns.Creational.FactoryMethod.Constants.ComponentTypes;
import org.design.patterns.Creational.FactoryMethod.Models.CPU;
import org.design.patterns.Creational.FactoryMethod.Models.CPUFactory;

import static org.design.patterns.Creational.FactoryMethod.Constants.ComponentTypes.CPUTypes.*;

public class CPUFactoryImpl implements CPUFactory {
    @Override
    public CPU build(ComponentTypes.CPUTypes type) {
        switch (type) {
            case M_1_CORE:
                return new CPU(M_1_CORE.name());
            case M_2_CORE:
                return new CPU(M_2_CORE.name());
            case M_4_CORE:
                return new CPU(M_4_CORE.name());
            case L_1_CORE:
                return new CPU(L_1_CORE.name());
            case L_4_CORE:
                return new CPU(L_4_CORE.name());
            default:
                return new CPU(L_2_CORE.name());
        }
    }
}
