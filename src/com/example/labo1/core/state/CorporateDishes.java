package com.example.labo1.core.state;

//Menu de comidas disponibles en un evento corporativo
public enum CorporateDishes {
    EXECUTIVE_CANGREBURGER("Cangreburguer Ejecutiva", "Servida en plato premium, con toque de coral"),
    OCEANIC_SALAD("Ensalada Oceánica", "Deluxe Lechuga marina, algas finas, crotones de coral"),
    SPECIAL_SEAFOOD_PLATTER("Fondo Marino Especial", "Filete de medusa, con vegetales globo"),
    GOLD_CORPORATE_COMBO("Combo Empresarial Gold", "Cangreburguer Ejecutiva + Ensalada + Bebida Pro");

    private final String name;
    private final String description;

    CorporateDishes(String name, String description) {
        this. name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
