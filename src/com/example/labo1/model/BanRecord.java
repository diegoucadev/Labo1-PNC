package com.example.labo1.model;

import java.time.LocalDate;

/*
*
*  Esta clase representa el baneo que sufre un usuario
*   cuando un evento no se concreta, el periodo por defecto
*   es de 30 dias.
*
*/
public class BanRecord {
    private Booker booker;
    private LocalDate banStartDate;
    private LocalDate banEndDate;
    //Periodo por defecto de baneo en dias
    public static final int defaultBanPeriod = 30;

    public BanRecord(Booker booker, LocalDate banStartDate, LocalDate banEndDate) {
        this.booker = booker;
        this.banStartDate = banStartDate;
        this.banEndDate = banEndDate;
    }

    public Booker getBooker() {
        return booker;
    }

    public void setBooker(Booker booker) {
        this.booker = booker;
    }

    public LocalDate getBanStartDate() {
        return banStartDate;
    }

    public void setBanStartDate(LocalDate banStartDate) {
        this.banStartDate = banStartDate;
    }

    public LocalDate getBanEndDate() {
        return banEndDate;
    }

    public void setBanEndDate(LocalDate banEndDate) {
        this.banEndDate = banEndDate;
    }
}
