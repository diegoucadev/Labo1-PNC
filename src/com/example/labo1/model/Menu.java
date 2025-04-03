package com.example.labo1.model;

import com.example.labo1.core.base.Edible;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private final List<Edible> availableDishes;
    private final List<Edible> availableBeverages;
    private final List<Edible> availableDesserts;
    private int maxNumberOfOrders;

    public Menu(int maxNumberOfOrders) {
        this.availableDishes = new ArrayList<>();
        this.availableBeverages = new ArrayList<>();
        this.availableDesserts = new ArrayList<>();
    }

    public int getMaxNumberOfOrders() {
        return maxNumberOfOrders;
    }

    public void setMaxNumberOfOrders(int maxNumberOfOrders) {
        this.maxNumberOfOrders = maxNumberOfOrders;
    }

    public void addDish(Edible dish) {
        availableDishes.add(dish);
    }

    public void addBeverage(Edible beverage) {
        availableBeverages.add(beverage);
    }

    public void addDessert(Edible dessert) {
        availableDesserts.add(dessert);
    }

    public List<Edible> getAvailableDishes() {
        return availableDishes;
    }

    public List<Edible> getAvailableBeverages() {
        return availableBeverages;
    }

    public List<Edible> getAvailableDesserts() {
        return availableDesserts;
    }

}
