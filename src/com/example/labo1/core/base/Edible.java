package com.example.labo1.core.base;

//Clase base para bebidas, comidas y postres
public abstract class Edible {
    protected String name;
    protected String description;

    public Edible(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Edible() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
