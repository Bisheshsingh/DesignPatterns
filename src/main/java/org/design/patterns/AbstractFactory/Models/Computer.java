package org.design.patterns.AbstractFactory.Models;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Computer {
    private final RAM ram;
    private final GPU gpu;
    private final CPU cpu;
    private final Storage storage;
}
