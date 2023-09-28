package org.design.patterns.Creational.FactoryMethod.Activity;

import org.design.patterns.Creational.FactoryMethod.Constants.ComponentTypes.RAMTypes;
import org.design.patterns.Creational.FactoryMethod.Models.RAMFactory;
import org.design.patterns.Creational.FactoryMethod.Models.RAM;

import static org.design.patterns.Creational.FactoryMethod.Constants.ComponentTypes.RAMTypes.*;


public class RAMFactoryImpl implements RAMFactory {
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
