package org.design.patterns.AbstractFactory.Activity;

import org.design.patterns.AbstractFactory.Constants.ComponentTypes;
import org.design.patterns.AbstractFactory.Models.Storage;
import org.design.patterns.AbstractFactory.Models.StorageAbstractFactory;

import static org.design.patterns.AbstractFactory.Constants.ComponentTypes.StorageTypes.*;

public class StorageFactory implements StorageAbstractFactory {
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
