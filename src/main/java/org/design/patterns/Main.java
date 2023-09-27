package org.design.patterns;

import org.design.patterns.AbstractFactory.Activity.ComputerFactoryProducer;
import org.design.patterns.AbstractFactory.Constants.ComputerTypes;
import org.design.patterns.AbstractFactory.Constants.FactoryTypes;
import org.design.patterns.AbstractFactory.Models.Computer;
import org.design.patterns.AbstractFactory.Models.ComputerAbstractFactory;

public class Main {
    public static void main(String[] args) {
        ComputerFactoryProducer computerFactoryProducer = new ComputerFactoryProducer();

        final ComputerAbstractFactory computerAbstractFactory =
                computerFactoryProducer.build(FactoryTypes.ComputerFactoryTypes.GAMING);

        final Computer computer = computerAbstractFactory.build(ComputerTypes.HIGH);

        System.out.println(computer.toString());
    }
}