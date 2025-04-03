package com.example.labo1.core.state;

public enum SpecialDessert {
    CHOCO_CORAL_BARS("Barras de chocolate con corales", "Barras de chocolates que tienen trozos de corales"),
    GLAZED_SEA_DONUTS("Donas glaceadas de mar", "Delicioooooooosas");

    private final String name;
    private final String description;

    SpecialDessert(String name, String description) {
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
