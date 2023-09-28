package org.design.patterns.Prototype.Activity;

import org.design.patterns.Creational.Prototype.Activity.Reptile;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class ReptileTest {
    @Test
    public void prototypeTest() {
        final Reptile lizard = new Reptile(
                true,
                true,
                4,
                false);
        assertNotNull(lizard);

        final Reptile snake = lizard.clone();
        assertNotNull(snake);
        snake.setLegs(0);

        final Reptile chameleon = lizard.clone();
        assertNotNull(chameleon);
        chameleon.setCanChangeColor(true);
    }
}