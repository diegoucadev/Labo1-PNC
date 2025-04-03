package com.example.labo1.view;

import com.example.labo1.model.Booker;

import java.util.Optional;
import java.util.Scanner;

public class BookerInputController {
    private final Scanner scanner = new Scanner(System.in);

    public BookerInputController() {
    }

    private String getStringInput(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    private int getInput(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.println("Ingresa una edad valida.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public Booker getBookerInput() {
        String firstName = getStringInput("Ingrese los nombres del usuario: ");
        String lastName = getStringInput("Ingrese los apellidos del usuario: ");
        String bbID = getStringInput("Ingrese el numero de identificacion del usuario: ");
        String residence = getStringInput("Ingrese el lugar de residencia del usuario: ");
        int age = getInput("Ingrese la edad del usuario: ");
        String phone = getStringInput("Ingrese el numero telefonico del usuario: ");
        String workplace = null;
        String isEmployee = getStringInput("Es el usuario empleado (ingrese si | cualquier otra cosa): ").toLowerCase();
        if (isEmployee.equals("si")) {
            workplace = getStringInput("Ingrese el nombre de la empresa: ");
        }

        return new Booker(firstName, lastName, bbID, residence, age, phone, workplace);
    }
}
