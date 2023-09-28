package org.design.patterns.FactoryMethod.Activity;

import com.google.inject.Inject;
import org.design.patterns.FactoryMethod.Constants.ComponentTypes;
import org.design.patterns.FactoryMethod.Constants.ComputerTypes;
import org.design.patterns.FactoryMethod.Models.Computer;
import org.design.patterns.Tools.GuiceConfig;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ServerComputerFactoryTest {
    @Inject
    private ServerComputerFactory computerFactory;

    @BeforeEach
    void setUp() {
        GuiceConfig.getInjector().injectMembers(this);
    }

    @Test
    public void highTest() {
        final Computer computer = computerFactory.build(ComputerTypes.HIGH);

        assertNotNull(computer);
        assertEquals(computer.getCpu().getName(), ComponentTypes.CPUTypes.L_4_CORE.name());
        assertEquals(computer.getGpu().getName(), ComponentTypes.GPUTypes.Radeon_RX_Vega_64.name());
        assertEquals(computer.getRam().getName(), ComponentTypes.RAMTypes.MS4096.name());
        assertEquals(computer.getStorage().getName(), ComponentTypes.StorageTypes.HDD1024.name());
    }

    @Test
    public void mediumTest() {
        final Computer computer = computerFactory.build(ComputerTypes.MEDIUM);

        assertNotNull(computer);
        assertEquals(computer.getCpu().getName(), ComponentTypes.CPUTypes.L_2_CORE.name());
        assertEquals(computer.getGpu().getName(), ComponentTypes.GPUTypes.GeForce_RTX_3060.name());
        assertEquals(computer.getRam().getName(), ComponentTypes.RAMTypes.MS2048.name());
        assertEquals(computer.getStorage().getName(), ComponentTypes.StorageTypes.HDD512.name());
    }

    @Test
    public void lowTest() {
        final Computer computer = computerFactory.build(ComputerTypes.LOW);

        assertNotNull(computer);
        assertEquals(computer.getCpu().getName(), ComponentTypes.CPUTypes.L_1_CORE.name());
        assertEquals(computer.getGpu().getName(), ComponentTypes.GPUTypes.GeForce_GTX_1660.name());
        assertEquals(computer.getRam().getName(), ComponentTypes.RAMTypes.MS1024.name());
        assertEquals(computer.getStorage().getName(), ComponentTypes.StorageTypes.HDD256.name());
    }
}