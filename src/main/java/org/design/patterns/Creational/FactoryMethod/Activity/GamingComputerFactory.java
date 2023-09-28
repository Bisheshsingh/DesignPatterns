package org.design.patterns.Creational.FactoryMethod.Activity;

import com.google.inject.Inject;
import lombok.AllArgsConstructor;
import org.design.patterns.Creational.FactoryMethod.Constants.ComponentTypes;
import org.design.patterns.Creational.FactoryMethod.Models.CPUFactory;
import org.design.patterns.Creational.FactoryMethod.Models.GPUFactory;
import org.design.patterns.Creational.FactoryMethod.Models.StorageFactory;
import org.design.patterns.Creational.FactoryMethod.Constants.ComputerTypes;
import org.design.patterns.Creational.FactoryMethod.Models.Computer;
import org.design.patterns.Creational.FactoryMethod.Models.ComputerFactory;
import org.design.patterns.Creational.FactoryMethod.Models.RAMFactory;

@AllArgsConstructor(onConstructor = @__(@Inject))
public class GamingComputerFactory implements ComputerFactory {
    private final StorageFactory storageFactory;
    private final CPUFactory cpuFactory;
    private final GPUFactory gpuFactory;
    private final RAMFactory ramFactory;

    @Override
    public Computer build(final ComputerTypes type) {
        switch (type) {
            case LOW:
                return Computer.builder()
                        .storage(storageFactory.build(ComponentTypes.StorageTypes.SSD256))
                        .cpu(cpuFactory.build(ComponentTypes.CPUTypes.M_1_CORE))
                        .gpu(gpuFactory.build(ComponentTypes.GPUTypes.GeForce_GTX_1660))
                        .ram(ramFactory.build(ComponentTypes.RAMTypes.MS4096))
                        .build();
            case MEDIUM:
                return Computer.builder()
                        .storage(storageFactory.build(ComponentTypes.StorageTypes.SSD512))
                        .cpu(cpuFactory.build(ComponentTypes.CPUTypes.M_2_CORE))
                        .gpu(gpuFactory.build(ComponentTypes.GPUTypes.Radeon_RX_5700))
                        .ram(ramFactory.build(ComponentTypes.RAMTypes.HS16384))
                        .build();
            case HIGH:
                return Computer.builder()
                        .storage(storageFactory.build(ComponentTypes.StorageTypes.SSD1024))
                        .cpu(cpuFactory.build(ComponentTypes.CPUTypes.M_4_CORE))
                        .gpu(gpuFactory.build(ComponentTypes.GPUTypes.GeForce_RTX_2060_Super))
                        .ram(ramFactory.build(ComponentTypes.RAMTypes.HS32768))
                        .build();
            default:
                return null;
        }
    }
}
