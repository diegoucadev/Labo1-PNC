package com.example.labo1.core.repository.abstraction;

import com.example.labo1.model.Reservation;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

public interface IReservationRepository {
    List<Reservation> getReservations();
    List<Reservation> getPendingReservations();
    Optional<Reservation> findByDateAndTime(LocalDate date, LocalTime startHour, LocalTime endHour);
}
