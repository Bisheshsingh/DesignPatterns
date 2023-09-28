package org.design.patterns.AbstractFactory.Models;

import org.design.patterns.AbstractFactory.Constants.FoodTypes.*;

public interface FoodAbstractFactory {
    Starter getStarter(StarterType type);

    MainCourse getMainCourse(MainCourseType type);

    Dessert getDessert(DessertType type);
}
