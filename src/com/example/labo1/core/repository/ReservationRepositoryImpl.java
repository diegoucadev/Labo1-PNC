package com.example.labo1.core.repository;

import com.example.labo1.core.repository.abstraction.IReservationRepository;
import com.example.labo1.model.Reservation;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReservationRepositoryImpl implements IReservationRepository {
    public static List<Reservation> reservationInMemoryDB = new ArrayList<>();
    public static int reservationCount = 0;

    public ReservationRepositoryImpl() {
    }

    @Override
    public List<Reservation> getReservations() {
        return List.of();
    }

    @Override
    public List<Reservation> getPendingReservations() {
        List<Reservation> pendingReservations = new ArrayList<>();
        for (Reservation reservation : reservationInMemoryDB) {
            if (reservation.getStatus().equals("pending")) {
                pendingReservations.add(reservation);
            }
        }
        return pendingReservations;
    }

    @Override
    public Optional<Reservation> findByDateAndTime(LocalDate date, LocalTime startHour, LocalTime endHour) {
        return reservationInMemoryDB.stream()
                .filter(e -> e.getReservationDate().equals(date))
                .filter(e -> e.getStartHour().equals(startHour))
                .filter(e -> e.getEndHour().equals(endHour))
                .findFirst();
    }
}
