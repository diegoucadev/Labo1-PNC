package com.example.labo1.model;

import com.example.labo1.core.base.Event;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class FamilyEvent extends Event {
    private String type;

    public FamilyEvent(String code, double price, int numberOfAttendees, Menu menu, String type) {
        super(code, price, numberOfAttendees, menu);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
