package org.design.patterns.Builder.Activity;

import org.design.patterns.Builder.Models.CPU;
import org.design.patterns.Builder.Models.Computer;
import org.design.patterns.Builder.Models.GPU;
import org.design.patterns.Builder.Models.RAM;
import org.design.patterns.Builder.Models.Storage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

class ComputerBuilderTest {
    @Test
    public void normalComputerBuilderTest() {
        final ComputerBuilder computerBuilder = new ComputerBuilder(new CPU(), new RAM());
        final Computer computer = computerBuilder.build();

        assertNotNull(computer);
        assertNotNull(computer.getCpu());
        assertNotNull(computer.getRam());
        assertNull(computer.getStorage());
        assertNull(computer.getGpu());
    }

    @Test
    public void gamingComputerBuilderTest() {
        final ComputerBuilder computerBuilder = new ComputerBuilder(new CPU(), new RAM())
                .withGpu(new GPU())
                .withStorage(new Storage());
        final Computer computer = computerBuilder.build();

        assertNotNull(computer);
        assertNotNull(computer.getCpu());
        assertNotNull(computer.getRam());
        assertNotNull(computer.getStorage());
        assertNotNull(computer.getGpu());
    }

}