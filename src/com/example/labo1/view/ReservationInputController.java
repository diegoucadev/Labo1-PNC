package com.example.labo1.view;

import com.example.labo1.core.state.EventStatus;
import com.example.labo1.model.Booker;
import com.example.labo1.model.Reservation;
import com.example.labo1.service.ReservationService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class ReservationInputController {
    private final Scanner scanner = new Scanner(System.in);
    private final BookerInputController bookerInputController = new BookerInputController();
    public ReservationInputController() {}

    private String getStringInput(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    private int getInput(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.println("Ingrese un numero valido");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static String generateRandomLetters(int length) {
        StringBuilder letters = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            char letter = (char) ('A' + random.nextInt(26));
            letters.append(letter);
        }
        return letters.toString();
    }

    private static String generateCorrelativeNumber(LocalDate reservationDate) {
        Random random = new Random();
        String randomNumbers = String.format("%02d", random.nextInt(100));
        String randomLetters = generateRandomLetters(2);
        String randomDigit = String.format("%d", random.nextInt(10));
        String currentDate = reservationDate.format(DateTimeFormatter.ofPattern("ddMMyyyy"));
        return "KB-" + randomNumbers + "T" + randomLetters + randomDigit + "-" + currentDate;
    }

    public Reservation getReservationInput() {
        System.out.println("Por favor, usa formato de 24 horas");
        int year = getInput("Ingresa el anio de la reservacion ");
        int month = getInput("Ingresa el mes de la reservacion ");
        int day = getInput("Ingresa el dia de la reservacion ");
        int beginHour = getInput("Ingresa la hora de inicio: ");
        int endHour = getInput("Ingresa la hora de fin: ");
        String correlativeNumber = generateCorrelativeNumber(LocalDate.of(year, month, day));
        String status = EventStatus.PENDING.getStatus();
        Booker booker = bookerInputController.getBookerInput();
    }
}
