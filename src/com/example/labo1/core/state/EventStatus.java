package com.example.labo1.core.state;

//Estados de un evento
public enum EventStatus {
    PENDING("Pendiente"),
    CANCELLED("Cancelado"),
    //Cuando el evento se concreta y termina satisfactoriamente
    FINISHED("Finalizado"),
    //Cuando el evento no se concreto por diversas razones
    MISSED("No concretado");

    private final String status;

    EventStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
