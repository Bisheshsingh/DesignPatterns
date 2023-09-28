package org.design.patterns.FactoryMethod.Activity;

import com.google.inject.Inject;
import org.design.patterns.FactoryMethod.Constants.ComponentTypes.*;
import org.design.patterns.FactoryMethod.Constants.ComputerTypes;
import org.design.patterns.FactoryMethod.Models.Computer;
import org.design.patterns.Tools.GuiceConfig;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class GamingComputerFactoryTest {
    @Inject
    private GamingComputerFactory computerFactory;

    @BeforeEach
    void setUp() {
        GuiceConfig.getInjector().injectMembers(this);
    }

    @Test
    public void highTest() {
        final Computer computer = computerFactory.build(ComputerTypes.HIGH);

        assertNotNull(computer);
        assertEquals(computer.getCpu().getName(), CPUTypes.M_4_CORE.name());
        assertEquals(computer.getGpu().getName(), GPUTypes.GeForce_RTX_2060_Super.name());
        assertEquals(computer.getRam().getName(), RAMTypes.HS32768.name());
        assertEquals(computer.getStorage().getName(), StorageTypes.SSD1024.name());
    }

    @Test
    public void mediumTest() {
        final Computer computer = computerFactory.build(ComputerTypes.MEDIUM);

        assertNotNull(computer);
        assertEquals(computer.getCpu().getName(), CPUTypes.M_2_CORE.name());
        assertEquals(computer.getGpu().getName(), GPUTypes.Radeon_RX_5700.name());
        assertEquals(computer.getRam().getName(), RAMTypes.HS16384.name());
        assertEquals(computer.getStorage().getName(), StorageTypes.SSD512.name());
    }

    @Test
    public void lowTest() {
        final Computer computer = computerFactory.build(ComputerTypes.LOW);

        assertNotNull(computer);
        assertEquals(computer.getCpu().getName(), CPUTypes.M_1_CORE.name());
        assertEquals(computer.getGpu().getName(), GPUTypes.GeForce_GTX_1660.name());
        assertEquals(computer.getRam().getName(), RAMTypes.MS4096.name());
        assertEquals(computer.getStorage().getName(), StorageTypes.SSD256.name());
    }
}