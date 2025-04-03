package com.example.labo1.core.state;

//Menu de bebidas para eventos empresariales
public enum CorporateBeverages {
    BIKINI_BOTTOM_COFFEE("Café Fondo de Bikini", "Mezcla fuerte de grano del abismo"),
    PREMIUM_ALGAE_TEA("Té de Algas Premium", "Infusión calmante para tiburones ejecutivos"),
    LUXURY_DEIONIZED_WATER("Agua Desionizada de Lujo", "0% sal, 100% elegancia"),
    EXECUTIVE_CORAL_SHAKE("Batido Ejecutivo de Coral", "Versión deluxe, servido en copa de burbuja");

    private final String name;
    private final String description;

    CorporateBeverages(String name, String description) {
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
