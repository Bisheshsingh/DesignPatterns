package org.design.patterns;

import org.design.patterns.FactoryMethod.Activity.ComputerFactoryProducer;
import org.design.patterns.FactoryMethod.Constants.ComputerTypes;
import org.design.patterns.FactoryMethod.Constants.FactoryTypes;
import org.design.patterns.FactoryMethod.Models.Computer;
import org.design.patterns.FactoryMethod.Models.ComputerFactory;

public class Main {
    public static void main(String[] args) {
        ComputerFactoryProducer computerFactoryProducer = new ComputerFactoryProducer();

        final ComputerFactory computerAbstractFactory =
                computerFactoryProducer.build(FactoryTypes.ComputerFactoryTypes.GAMING);

        final Computer computer = computerAbstractFactory.build(ComputerTypes.HIGH);

        System.out.println(computer.toString());
    }
}