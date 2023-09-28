package org.design.patterns.AbstractFactory.Activity;

import org.design.patterns.AbstractFactory.Constants.FoodTypes;
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

public class FoodFactory implements FoodAbstractFactory {
    @Override
    public Starter getStarter(FoodTypes.StarterType type) {
        switch (type) {
            case FRENCH_FRIES:
                return new Fries();
            case ROLL:
                return new Roll();
            default:
                return null;
        }
    }

    @Override
    public MainCourse getMainCourse(FoodTypes.MainCourseType type) {
        switch (type) {
            case BURGER:
                return new Burger();
            case PIZZA:
                return new Pizza();
            default:
                return null;
        }
    }

    @Override
    public Dessert getDessert(FoodTypes.DessertType type) {
        switch (type) {
            case CHOCO_LAVA_CAKE:
                return new ChocoLavaCake();
            case ICE_CREAM:
                return new IceCream();
            default:
                return null;
        }
    }
}
