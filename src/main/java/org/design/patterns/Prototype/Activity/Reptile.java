package org.design.patterns.Prototype.Activity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.design.patterns.Prototype.Models.Prototype;

@Data
@AllArgsConstructor
public class Reptile implements Prototype {
    private Boolean hasTail;
    private Boolean hasHead;
    private Integer legs;
    private Boolean canChangeColor;

    @Override
    public Reptile clone() {
        return new Reptile(this.hasTail, this.hasHead,
                this.legs, this.canChangeColor);
    }
}
