package org.design.patterns.AbstractFactory.Activity;

import org.design.patterns.AbstractFactory.Constants.ComponentTypes.RAMTypes;
import org.design.patterns.AbstractFactory.Models.RAM;
import org.design.patterns.AbstractFactory.Models.RAMAbstractFactory;

import static org.design.patterns.AbstractFactory.Constants.ComponentTypes.RAMTypes.*;


public class RAMFactory implements RAMAbstractFactory {
    @Override
    public RAM build(final RAMTypes type) {
        switch (type) {
            case HS8192:
                return new RAM(HS8192.name());
            case HS16384:
                return new RAM(HS16384.name());
            case HS32768:
                return new RAM(HS32768.name());
            case MS2048:
                return new RAM(MS2048.name());
            case MS4096:
                return new RAM(MS4096.name());
            default:
                return new RAM(MS1024.name());
        }
    }
}
