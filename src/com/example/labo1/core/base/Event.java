package com.example.labo1.core.base;

import com.example.labo1.model.Menu;
import com.example.labo1.model.Reservation;

import java.time.LocalTime;

/*
 *   Clase base para eventos de:
 *   - cumpleanios
 *   - Cena y almuerzos familiares
 *   - Cena y almuerzos empresariales
 */
public abstract class Event {
    protected String code;
    protected double price;
    //Pago de anticipo
    protected int numberOfAttendees;
    private Menu menu;

    public Event(String code, double price, int numberOfAttendees, Menu menu) {
        this.code = code;
        this.price = price;
        this.numberOfAttendees = numberOfAttendees;
        this.menu = menu;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberOfAttendees() {
        return numberOfAttendees;
    }

    public void setNumberOfAttendees(int numberOfAttendees) {
        this.numberOfAttendees = numberOfAttendees;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}
