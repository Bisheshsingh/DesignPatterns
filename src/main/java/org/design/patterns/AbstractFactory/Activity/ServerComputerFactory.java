package org.design.patterns.AbstractFactory.Activity;

import com.google.inject.Inject;
import lombok.AllArgsConstructor;
import org.design.patterns.AbstractFactory.Constants.ComponentTypes.*;
import org.design.patterns.AbstractFactory.Constants.ComputerTypes;
import org.design.patterns.AbstractFactory.Models.CPUAbstractFactory;
import org.design.patterns.AbstractFactory.Models.Computer;
import org.design.patterns.AbstractFactory.Models.ComputerAbstractFactory;
import org.design.patterns.AbstractFactory.Models.GPUAbstractFactory;
import org.design.patterns.AbstractFactory.Models.RAMAbstractFactory;
import org.design.patterns.AbstractFactory.Models.StorageAbstractFactory;

@AllArgsConstructor(onConstructor = @__(@Inject))
public class ServerComputerFactory implements ComputerAbstractFactory {
    private final StorageAbstractFactory storageFactory;
    private final CPUAbstractFactory cpuFactory;
    private final GPUAbstractFactory gpuFactory;
    private final RAMAbstractFactory ramFactory;

    @Override
    public Computer build(final ComputerTypes type) {
        switch (type) {
            case LOW:
                return Computer.builder()
                        .storage(storageFactory.build(StorageTypes.HDD256))
                        .cpu(cpuFactory.build(CPUTypes.L_1_CORE))
                        .gpu(gpuFactory.build(GPUTypes.GeForce_GTX_1660))
                        .ram(ramFactory.build(RAMTypes.MS1024))
                        .build();
            case MEDIUM:
                return Computer.builder()
                        .storage(storageFactory.build(StorageTypes.HDD512))
                        .cpu(cpuFactory.build(CPUTypes.L_2_CORE))
                        .gpu(gpuFactory.build(GPUTypes.GeForce_RTX_3060))
                        .ram(ramFactory.build(RAMTypes.MS2048))
                        .build();
            case HIGH:
                return Computer.builder()
                        .storage(storageFactory.build(StorageTypes.HDD1024))
                        .cpu(cpuFactory.build(CPUTypes.L_4_CORE))
                        .gpu(gpuFactory.build(GPUTypes.Radeon_RX_Vega_64))
                        .ram(ramFactory.build(RAMTypes.MS4096))
                        .build();
            default:
                return null;
        }
    }
}

