package com.example.labo1.core.state;

public enum MenuType {
    REGULAR("Regular"),
    CORPORATE("Empresarial");

    private final String type;

    MenuType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
