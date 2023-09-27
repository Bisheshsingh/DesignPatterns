package org.design.patterns.AbstractFactory.Activity;

import com.google.inject.Inject;
import lombok.AllArgsConstructor;
import org.design.patterns.AbstractFactory.Constants.ComponentTypes.*;
import org.design.patterns.AbstractFactory.Constants.ComputerTypes;
import org.design.patterns.AbstractFactory.Models.*;

@AllArgsConstructor(onConstructor = @__(@Inject))
public class GamingComputerFactory implements ComputerAbstractFactory {
    private final StorageAbstractFactory storageFactory;
    private final CPUAbstractFactory cpuFactory;
    private final GPUAbstractFactory gpuFactory;
    private final RAMAbstractFactory ramFactory;

    @Override
    public Computer build(final ComputerTypes type) {
        switch (type) {
            case LOW:
                return Computer.builder()
                        .storage(storageFactory.build(StorageTypes.SSD256))
                        .cpu(cpuFactory.build(CPUTypes.M_1_CORE))
                        .gpu(gpuFactory.build(GPUTypes.GeForce_GTX_1660))
                        .ram(ramFactory.build(RAMTypes.MS4096))
                        .build();
            case MEDIUM:
                return Computer.builder()
                        .storage(storageFactory.build(StorageTypes.SSD512))
                        .cpu(cpuFactory.build(CPUTypes.M_2_CORE))
                        .gpu(gpuFactory.build(GPUTypes.Radeon_RX_5700))
                        .ram(ramFactory.build(RAMTypes.HS16384))
                        .build();
            case HIGH:
                return Computer.builder()
                        .storage(storageFactory.build(StorageTypes.SSD1024))
                        .cpu(cpuFactory.build(CPUTypes.M_4_CORE))
                        .gpu(gpuFactory.build(GPUTypes.GeForce_RTX_2060_Super))
                        .ram(ramFactory.build(RAMTypes.HS32768))
                        .build();
            default:
                return null;
        }
    }
}
