package com.example.labo1.core.state;

//Menu de alimentos disponibles para eventos no empresariales
public enum RegularDishes {
    CHEESE_KRABBY_PATTY("Cangreburguer con Queso", "La clásica con queso extra"),
    DOUBLE_KRABBY_PATTY("Cangreburguer Doble", "Doble carne, doble sabor"),
    BIKINI_BOTTOM_FRIES("Papas Fondo de Bikini", "Papas fritas estilo marino"),
    SIMPLE_COMBO("Combo Sencillo", "Cangreburguer + Papas + Refresco");

    private final String name;
    private final String description;

    RegularDishes(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}