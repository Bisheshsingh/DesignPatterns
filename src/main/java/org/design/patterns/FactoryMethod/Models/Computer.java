package org.design.patterns.FactoryMethod.Models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@ToString
@Getter
@Setter
public class Computer {
    private final GPU gpu;
    private final CPU cpu;
    private final RAM ram;
    private final Storage storage;

}
