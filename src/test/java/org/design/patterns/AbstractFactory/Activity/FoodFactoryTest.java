package org.design.patterns.AbstractFactory.Activity;

import com.google.inject.Inject;
import org.design.patterns.AbstractFactory.Constants.FoodTypes.*;
import org.design.patterns.AbstractFactory.Models.Burger;
import org.design.patterns.AbstractFactory.Models.ChocoLavaCake;
import org.design.patterns.AbstractFactory.Models.Dessert;
import org.design.patterns.AbstractFactory.Models.FoodAbstractFactory;
import org.design.patterns.AbstractFactory.Models.Fries;
import org.design.patterns.AbstractFactory.Models.IceCream;
import org.design.patterns.AbstractFactory.Models.MainCourse;
import org.design.patterns.AbstractFactory.Models.Pizza;
import org.design.patterns.AbstractFactory.Models.Roll;
import org.design.patterns.AbstractFactory.Models.Starter;
import org.design.patterns.Modules.AbstractFactoryModule;
import org.design.patterns.Tools.GuiceConfig;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FoodFactoryTest {
    @Inject
    private FoodAbstractFactory foodFactory;

    @BeforeEach
    void setUp() {
        GuiceConfig.init(new AbstractFactoryModule());
        GuiceConfig.getInjector().injectMembers(this);
    }

    @Test
    void getStarterTest() {
        final Starter starter1 = foodFactory.getStarter(StarterType.FRENCH_FRIES);
        final Starter starter2 = foodFactory.getStarter(StarterType.ROLL);

        assertNotNull(starter1);
        assertNotNull(starter2);
        assertInstanceOf(Fries.class, starter1);
        assertInstanceOf(Roll.class, starter2);
    }

    @Test
    void getMainCourseTest() {
        final MainCourse mainCourse1 = foodFactory.getMainCourse(MainCourseType.BURGER);
        final MainCourse mainCourse2 = foodFactory.getMainCourse(MainCourseType.PIZZA);

        assertNotNull(mainCourse1);
        assertNotNull(mainCourse2);
        assertInstanceOf(Burger.class, mainCourse1);
        assertInstanceOf(Pizza.class, mainCourse2);
    }

    @Test
    void getDessertTest() {
        final Dessert dessert1 = foodFactory.getDessert(DessertType.ICE_CREAM);
        final Dessert dessert2 = foodFactory.getDessert(DessertType.CHOCO_LAVA_CAKE);

        assertNotNull(dessert1);
        assertNotNull(dessert2);
        assertInstanceOf(IceCream.class, dessert1);
        assertInstanceOf(ChocoLavaCake.class, dessert2);
    }
}