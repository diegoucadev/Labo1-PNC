package com.example.labo1.model;

import com.example.labo1.core.base.Event;

import java.time.LocalTime;

/*
 *
 *   Clase utilizada par representar un evento empresarial
 *   hereda de clase base evento (Event) y agrega propiedades
 *   propias de un evento empresarial como el nombre de la compania
 *   y el codigo de vestimenta.
 *
 */

public class CorporateEvent extends Event {
    private String type;
    private String companyName;
    private String dressCode;

    public CorporateEvent(String code, double price, int numberOfAttendees, Menu menu, String type, String companyName, String dressCode) {
        super(code, price, numberOfAttendees, menu);
        this.type = type;
        this.companyName = companyName;
        this.dressCode = dressCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDressCode() {
        return dressCode;
    }

    public void setDressCode(String dressCode) {
        this.dressCode = dressCode;
    }
}
