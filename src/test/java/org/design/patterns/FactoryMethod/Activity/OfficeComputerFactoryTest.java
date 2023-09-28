package org.design.patterns.FactoryMethod.Activity;

import com.google.inject.Inject;
import org.design.patterns.FactoryMethod.Constants.ComponentTypes;
import org.design.patterns.FactoryMethod.Constants.ComputerTypes;
import org.design.patterns.FactoryMethod.Models.Computer;
import org.design.patterns.Tools.GuiceConfig;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OfficeComputerFactoryTest {
    @Inject
    private OfficeComputerFactory computerFactory;

    @BeforeEach
    void setUp() {
        GuiceConfig.getInjector().injectMembers(this);
    }

    @Test
    public void highTest() {
        final Computer computer = computerFactory.build(ComputerTypes.HIGH);

        assertNotNull(computer);
        assertEquals(computer.getCpu().getName(), ComponentTypes.CPUTypes.M_2_CORE.name());
        assertEquals(computer.getGpu().getName(), ComponentTypes.GPUTypes.GeForce_RTX_2060_Super.name());
        assertEquals(computer.getRam().getName(), ComponentTypes.RAMTypes.HS8192.name());
        assertEquals(computer.getStorage().getName(), ComponentTypes.StorageTypes.SSD1024.name());
    }

    @Test
    public void mediumTest() {
        final Computer computer = computerFactory.build(ComputerTypes.MEDIUM);

        assertNotNull(computer);
        assertEquals(computer.getCpu().getName(), ComponentTypes.CPUTypes.L_4_CORE.name());
        assertEquals(computer.getGpu().getName(), ComponentTypes.GPUTypes.Radeon_RX_5700.name());
        assertEquals(computer.getRam().getName(), ComponentTypes.RAMTypes.MS4096.name());
        assertEquals(computer.getStorage().getName(), ComponentTypes.StorageTypes.SSD512.name());
    }

    @Test
    public void lowTest() {
        final Computer computer = computerFactory.build(ComputerTypes.LOW);

        assertNotNull(computer);
        assertEquals(computer.getCpu().getName(), ComponentTypes.CPUTypes.L_2_CORE.name());
        assertEquals(computer.getGpu().getName(), ComponentTypes.GPUTypes.Radeon_RX_Vega_64.name());
        assertEquals(computer.getRam().getName(), ComponentTypes.RAMTypes.MS1024.name());
        assertEquals(computer.getStorage().getName(), ComponentTypes.StorageTypes.HDD512.name());
    }
}