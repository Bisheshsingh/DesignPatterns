package org.design.patterns.FactoryMethod.Activity;

import org.design.patterns.FactoryMethod.Constants.ComponentTypes;
import org.design.patterns.FactoryMethod.Models.Storage;

import static org.design.patterns.FactoryMethod.Constants.ComponentTypes.StorageTypes.*;

public class StorageFactoryImpl implements org.design.patterns.FactoryMethod.Models.StorageFactory {
    @Override
    public Storage build(ComponentTypes.StorageTypes type) {
        switch (type) {
            case SSD256:
                return new Storage(SSD256.name());
            case SSD512:
                return new Storage(SSD512.name());
            case SSD1024:
                return new Storage(SSD1024.name());
            case HDD256:
                return new Storage(HDD256.name());
            case HDD512:
                return new Storage(HDD512.name());
            default:
                return new Storage(HDD1024.name());
        }
    }
}
