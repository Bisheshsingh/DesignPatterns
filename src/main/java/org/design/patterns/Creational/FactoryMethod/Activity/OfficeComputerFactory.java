package org.design.patterns.Creational.FactoryMethod.Activity;

import com.google.inject.Inject;
import lombok.AllArgsConstructor;
import org.design.patterns.Creational.FactoryMethod.Constants.ComponentTypes.*;
import org.design.patterns.Creational.FactoryMethod.Constants.ComputerTypes;
import org.design.patterns.Creational.FactoryMethod.Models.CPUFactory;
import org.design.patterns.Creational.FactoryMethod.Models.Computer;
import org.design.patterns.Creational.FactoryMethod.Models.ComputerFactory;
import org.design.patterns.Creational.FactoryMethod.Models.GPUFactory;
import org.design.patterns.Creational.FactoryMethod.Models.RAMFactory;
import org.design.patterns.Creational.FactoryMethod.Models.StorageFactory;

@AllArgsConstructor(onConstructor = @__(@Inject))
public class OfficeComputerFactory implements ComputerFactory {
    private final StorageFactory storageFactory;
    private final CPUFactory cpuFactory;
    private final GPUFactory gpuFactory;
    private final RAMFactory ramFactory;

    @Override
    public Computer build(final ComputerTypes type) {
        switch (type) {
            case LOW:
                return Computer.builder()
                        .storage(storageFactory.build(StorageTypes.HDD512))
                        .cpu(cpuFactory.build(CPUTypes.L_2_CORE))
                        .gpu(gpuFactory.build(GPUTypes.Radeon_RX_Vega_64))
                        .ram(ramFactory.build(RAMTypes.MS1024))
                        .build();
            case MEDIUM:
                return Computer.builder()
                        .storage(storageFactory.build(StorageTypes.SSD512))
                        .cpu(cpuFactory.build(CPUTypes.L_4_CORE))
                        .gpu(gpuFactory.build(GPUTypes.Radeon_RX_5700))
                        .ram(ramFactory.build(RAMTypes.MS4096))
                        .build();
            case HIGH:
                return Computer.builder()
                        .storage(storageFactory.build(StorageTypes.SSD1024))
                        .cpu(cpuFactory.build(CPUTypes.M_2_CORE))
                        .gpu(gpuFactory.build(GPUTypes.GeForce_RTX_2060_Super))
                        .ram(ramFactory.build(RAMTypes.HS8192))
                        .build();
            default:
                return null;
        }
    }
}
