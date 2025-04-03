package com.example.labo1.core.state;

//Codigo de vestimenta para eventos empresariales
public enum DressCode {
    FORMAL("Formal"),
    CASUAL("Casual");

    private final String type;
    DressCode(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
