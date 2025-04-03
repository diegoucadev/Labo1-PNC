package com.example.labo1.core.state;

//Menu de bebidas disponibles para eventos no empresariales
public enum RegularBeverages {
    KELP_SODA("Refresco de Kelp", "Gaseosa tradicional de kelp"),
    JELLYFISH_JUICE("Jugo de Medusa", "100% exprimido (cuidado con los piquetes)"),
    SALTWATER("Agua Salada", "Filtrada (más o menos)"),
    CORAL_SHAKE("Batido de Coral", "Batido dulce con toque de algas");

    private final String name;
    private final String description;

    RegularBeverages(String name, String description) {
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
