package com.example.labo1.core.repository.abstraction;

import com.example.labo1.model.Menu;

public interface IMenuRepository {
    Menu getRegularMenu(int maxNumberOfOrders);
    Menu getCorporateMenu(int maxNumberOfOrders, boolean hasDesserts);
}
