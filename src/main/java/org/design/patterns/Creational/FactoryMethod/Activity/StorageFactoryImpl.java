package org.design.patterns.Creational.FactoryMethod.Activity;

import org.design.patterns.Creational.FactoryMethod.Constants.ComponentTypes;
import org.design.patterns.Creational.FactoryMethod.Models.Storage;
import org.design.patterns.Creational.FactoryMethod.Models.StorageFactory;

public class StorageFactoryImpl implements StorageFactory {
    @Override
    public Storage build(ComponentTypes.StorageTypes type) {
        switch (type) {
            case SSD256:
                return new Storage(ComponentTypes.StorageTypes.SSD256.name());
            case SSD512:
                return new Storage(ComponentTypes.StorageTypes.SSD512.name());
            case SSD1024:
                return new Storage(ComponentTypes.StorageTypes.SSD1024.name());
            case HDD256:
                return new Storage(ComponentTypes.StorageTypes.HDD256.name());
            case HDD512:
                return new Storage(ComponentTypes.StorageTypes.HDD512.name());
            default:
                return new Storage(ComponentTypes.StorageTypes.HDD1024.name());
        }
    }
}
