package com.example.labo1.core.state;

//Contiene los codigos y precios de los eventos
public enum EventDefinition {
    BIRTHDAY("HBD-E-01", 380.00),
    FAMILY_LUNCH("EE-E-002", 180.00),
    FAMILY_DINNER("FD-E-04", 200.00),
    CORPORATE_LUNCH("EE-E-03", 300),
    CORPORATE_DINNER("ED-E-03", 320);

    private final String code;
    private final double price;

    EventDefinition(String code, double price) {
        this.code = code;
        this.price = price;

    }

    public String getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }

}
