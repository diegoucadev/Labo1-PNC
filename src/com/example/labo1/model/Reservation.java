package com.example.labo1.model;

import com.example.labo1.core.base.Event;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/*
 *   Clase que representa una reserva
 * */

public class Reservation {
    private LocalDate reservationDate;
    private LocalTime startHour;
    private LocalTime endHour;
    private Booker booker;
    private String correlativeNumber;
    private String status;
    private Event event;
    private double upfrontPayment;

    public Reservation(LocalDate reservationDate, LocalTime startHour, LocalTime endHour, Booker booker, String correlativeNumber, String status, Event event, double upfrontPayment) {
        this.reservationDate = reservationDate;
        this.startHour = startHour;
        this.endHour = endHour;
        this.booker = booker;
        this.correlativeNumber = correlativeNumber;
        this.status = status;
        this.event = event;
        this.upfrontPayment = upfrontPayment;
    }

    public Reservation() {
    }

    public LocalDate getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDate reservationDate) {
        this.reservationDate = reservationDate;
    }

    public LocalTime getStartHour() {
        return startHour;
    }

    public void setStartHour(LocalTime startHour) {
        this.startHour = startHour;
    }

    public LocalTime getEndHour() {
        return endHour;
    }

    public void setEndHour(LocalTime endHour) {
        this.endHour = endHour;
    }

    public Booker getBooker() {
        return booker;
    }

    public void setBooker(Booker booker) {
        this.booker = booker;
    }

    public String getCorrelativeNumber() {
        return correlativeNumber;
    }

    public void setCorrelativeNumber(String correlativeNumber) {
        this.correlativeNumber = correlativeNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public double getUpfrontPayment() {
        return upfrontPayment;
    }

    public void setUpfrontPayment(double upfrontPayment) {
        this.upfrontPayment = upfrontPayment;
    }
}
