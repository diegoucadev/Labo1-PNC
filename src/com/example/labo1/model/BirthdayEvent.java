package com.example.labo1.model;

import com.example.labo1.core.base.Event;
import com.example.labo1.core.state.RegularDishes;

import java.time.LocalTime;

/*
 *
 *   Clase utilizada para representar un evento de cumpleanios
 *   Hereda de la clase base evento (Event) y agrega propiedades
 *   especificas como el nombre del cumpleaniero, las edad que cumple,
 *   su color favorito y el tipo de regalo
 *
 * */

public class BirthdayEvent extends Event {
    private String birthdayBoyName;
    private int age;
    private String favoriteColor;
    private String giftType;

    public BirthdayEvent(String code, double price, int numberOfAttendees, Menu menu, String birthdayBoyName, int age, String favoriteColor, String giftType) {
        super(code, price, numberOfAttendees, menu);
        this.birthdayBoyName = birthdayBoyName;
        this.age = age;
        this.favoriteColor = favoriteColor;
        this.giftType = giftType;
        }

    public String getBirthdayBoyName() {
        return birthdayBoyName;
    }

    public void setBirthdayBoyName(String birthdayBoyName) {
        this.birthdayBoyName = birthdayBoyName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }

    public String getGiftType() {
        return giftType;
    }

    public void setGiftType(String giftType) {
        this.giftType = giftType;
    }
}
