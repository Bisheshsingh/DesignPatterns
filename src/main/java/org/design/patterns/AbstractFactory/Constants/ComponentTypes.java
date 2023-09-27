package org.design.patterns.AbstractFactory.Constants;

import java.security.PublicKey;

public class ComponentTypes {
    public enum CPUTypes {
        M_1_CORE,M_2_CORE,M_4_CORE,
        L_1_CORE,L_2_CORE,L_4_CORE,
    }

    public enum RAMTypes {
        MS1024, MS2048, MS4096,
        HS8192, HS16384,HS32768;
    }

    public enum GPUTypes {
        GeForce_GTX_1660, Radeon_RX_Vega_64, GeForce_RTX_3060,
        GeForce_RTX_2060_Super, Radeon_RX_5700;
    }

    public enum StorageTypes {
        SSD256, SSD512, SSD1024,
        HDD256, HDD512, HDD1024;
    }
}
