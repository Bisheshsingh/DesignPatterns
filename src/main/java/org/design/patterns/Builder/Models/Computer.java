package org.design.patterns.Builder.Models;

import lombok.Data;

@Data
public class Computer {
    private final CPU cpu;
    private final RAM ram;
    private Storage storage;
    private GPU gpu;
}
