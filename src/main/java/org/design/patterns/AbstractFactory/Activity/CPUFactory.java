package org.design.patterns.AbstractFactory.Activity;

import org.design.patterns.AbstractFactory.Constants.ComponentTypes;
import org.design.patterns.AbstractFactory.Models.CPU;
import org.design.patterns.AbstractFactory.Models.CPUAbstractFactory;

import static org.design.patterns.AbstractFactory.Constants.ComponentTypes.CPUTypes.*;

public class CPUFactory implements CPUAbstractFactory {
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
