package org.design.patterns.AbstractFactory.Activity;

import org.design.patterns.AbstractFactory.Constants.ComponentTypes;
import org.design.patterns.AbstractFactory.Models.GPU;
import org.design.patterns.AbstractFactory.Models.GPUAbstractFactory;

import static org.design.patterns.AbstractFactory.Constants.ComponentTypes.GPUTypes.*;

public class GPUFactory implements GPUAbstractFactory {
    @Override
    public GPU build(ComponentTypes.GPUTypes type) {
        switch (type) {
            case GeForce_GTX_1660:
                return new GPU(GeForce_GTX_1660.name());
            case Radeon_RX_Vega_64:
                return new GPU(Radeon_RX_Vega_64.name());
            case GeForce_RTX_3060:
                return new GPU(GeForce_RTX_3060.name());
            case GeForce_RTX_2060_Super:
                return new GPU(GeForce_RTX_2060_Super.name());
            default:
                return new GPU(Radeon_RX_5700.name());
        }
    }
}
