package org.design.patterns.Creational.AbstractFactory.Models;

import org.design.patterns.Creational.AbstractFactory.Constants.FoodTypes.*;

public interface FoodAbstractFactory {
    Starter getStarter(StarterType type);

    MainCourse getMainCourse(MainCourseType type);

    Dessert getDessert(DessertType type);
}
