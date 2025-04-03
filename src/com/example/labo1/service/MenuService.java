package com.example.labo1.service;

import com.example.labo1.core.base.Edible;
import com.example.labo1.core.repository.abstraction.IMenuRepository;
import com.example.labo1.core.state.*;
import com.example.labo1.model.Beverage;
import com.example.labo1.model.Dessert;
import com.example.labo1.model.Dish;
import com.example.labo1.model.Menu;

import java.util.ArrayList;
import java.util.List;

public class MenuService {
    private final IMenuRepository menuRepository;
    public MenuService(IMenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }
    public Menu getCorporateMenu(int maxNumberOfOrders, boolean hasDesserts) {
        return this.menuRepository.getCorporateMenu(maxNumberOfOrders, hasDesserts);
    }

    public Menu getRegularMenu(int maxNumberOfOrders) {
        return this.menuRepository.getRegularMenu(maxNumberOfOrders);
    }
}
