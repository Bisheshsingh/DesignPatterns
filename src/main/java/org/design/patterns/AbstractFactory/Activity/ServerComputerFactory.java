package org.design.patterns.AbstractFactory.Activity;

import com.google.inject.Inject;
import lombok.AllArgsConstructor;
import org.design.patterns.AbstractFactory.Constants.ComponentTypes;
import org.design.patterns.AbstractFactory.Constants.ComputerTypes;
import org.design.patterns.AbstractFactory.Models.*;

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
                        .storage(storageFactory.build(ComponentTypes.StorageTypes.HDD256))
                        .cpu(cpuFactory.build(ComponentTypes.CPUTypes.L_1_CORE))
                        .gpu(gpuFactory.build(ComponentTypes.GPUTypes.GeForce_GTX_1660))
                        .ram(ramFactory.build(ComponentTypes.RAMTypes.MS1024))
                        .build();
            case MEDIUM:
                return Computer.builder()
                        .storage(storageFactory.build(ComponentTypes.StorageTypes.HDD512))
                        .cpu(cpuFactory.build(ComponentTypes.CPUTypes.L_2_CORE))
                        .gpu(gpuFactory.build(ComponentTypes.GPUTypes.GeForce_RTX_3060))
                        .ram(ramFactory.build(ComponentTypes.RAMTypes.MS2048))
                        .build();
            case HIGH:
                return Computer.builder()
                        .storage(storageFactory.build(ComponentTypes.StorageTypes.HDD1024))
                        .cpu(cpuFactory.build(ComponentTypes.CPUTypes.L_4_CORE))
                        .gpu(gpuFactory.build(ComponentTypes.GPUTypes.Radeon_RX_Vega_64))
                        .ram(ramFactory.build(ComponentTypes.RAMTypes.MS4096))
                        .build();
            default:
                return null;
        }
    }
}

