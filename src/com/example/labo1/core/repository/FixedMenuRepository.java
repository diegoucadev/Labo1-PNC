package com.example.labo1.core.repository;

import com.example.labo1.core.base.Edible;
import com.example.labo1.core.repository.abstraction.IMenuRepository;
import com.example.labo1.core.state.*;
import com.example.labo1.model.Beverage;
import com.example.labo1.model.Dessert;
import com.example.labo1.model.Dish;
import com.example.labo1.model.Menu;

import java.util.ArrayList;
import java.util.List;

public class FixedMenuRepository implements IMenuRepository {
    @Override
    public Menu getRegularMenu(int maxNumberOfOrders) {
        Menu menu = new Menu(maxNumberOfOrders);
        List<Edible> availableDishes = new ArrayList<>();
        List<Edible> availableBeverages = new ArrayList<>();
        for (RegularDishes dish : RegularDishes.values()) {
            Dish newDish = new Dish(dish.getName(), dish.getDescription());
            menu.addDish(newDish);
        }
        for (RegularBeverages beverage : RegularBeverages.values()) {
            Beverage newBeverage = new Beverage(beverage.getName(), beverage.getDescription());
            menu.addBeverage(newBeverage);
        }
        return menu;
    }

    @Override
    public Menu getCorporateMenu(int maxNumberOfOrders, boolean hasDesserts) {
        Menu menu = new Menu(maxNumberOfOrders);
        List<Edible> availableDishes = new ArrayList<>();
        List<Edible> availableBeverages = new ArrayList<>();
        for (CorporateDishes dish : CorporateDishes.values()) {
            Dish newDish = new Dish(dish.getName(), dish.getDescription());
            menu.addDish(newDish);
        }
        for (CorporateBeverages beverage : CorporateBeverages.values()) {
            Beverage newBeverage = new Beverage(beverage.getName(), beverage.getDescription());
            menu.addBeverage(newBeverage);
        }
        if (hasDesserts) {
            for (SpecialDessert specialDessert : SpecialDessert.values()) {
                Dessert dessert = new Dessert(specialDessert.getName(), specialDessert.getDescription());
            }
        }
        return menu;
    }
}
