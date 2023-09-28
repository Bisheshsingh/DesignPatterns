package org.design.patterns.Builder.Activity;

import org.design.patterns.Builder.Models.CPU;
import org.design.patterns.Builder.Models.Computer;
import org.design.patterns.Builder.Models.GPU;
import org.design.patterns.Builder.Models.RAM;
import org.design.patterns.Builder.Models.Storage;

public class ComputerBuilder {
    private final CPU cpu;
    private final RAM ram;
    private GPU gpu;
    private Storage storage;

    public ComputerBuilder(final CPU cpu, final RAM ram) {
        this.cpu = cpu;
        this.ram = ram;
    }

    public ComputerBuilder withGpu(final GPU gpu) {
        this.gpu = gpu;
        return this;
    }

    public ComputerBuilder withStorage(final Storage storage) {
        this.storage = storage;
        return this;
    }

    public Computer build() {
        final Computer computer = new Computer(cpu, ram);
        computer.setGpu(gpu);
        computer.setStorage(storage);

        return computer;
    }
}
