package com.example.labo1.view;

import com.example.labo1.core.base.Event;
import com.example.labo1.core.state.DressCode;
import com.example.labo1.core.state.EventDefinition;
import com.example.labo1.core.state.EventType;
import com.example.labo1.core.state.GiftType;
import com.example.labo1.model.BirthdayEvent;
import com.example.labo1.model.CorporateEvent;
import com.example.labo1.model.FamilyEvent;
import com.example.labo1.service.MenuService;

import java.util.Scanner;

public class EventInputController {
    private final Scanner scanner = new Scanner(System.in);
    private final MenuService menuService;

    public EventInputController(MenuService menuService) {
        this.menuService = menuService;
    }

    private String getStringInput(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    private double getDoubleInput(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.println("Ingrese un número válido");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    private int getIntInput(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.println("Ingrese un número válido");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public Event selectEventType() {
        System.out.println("=== Seleccione un tipo de evento ===");
        System.out.println("1. Familiar");
        System.out.println("2. Empresarial");
        System.out.println("3. Cumpleanios");
        int eventType;
        do {
            eventType = getIntInput("Ingrese un numero (1 - 2 - 3): ");
        } while (eventType < 1 || eventType > 3);
        return switch (eventType) {
            case 1 -> getFamilyEventInput();
            case 2 -> getCorporateEventInput();
            case 3 -> getBirthdayEventInput();
            default -> throw new IllegalStateException("Valor inesperado: " + eventType);
        };
    }

    private boolean validateNumberOfAttendees(int numberOfAttendees, EventType eventType) {
        return numberOfAttendees < eventType.getMinimumNumberOfAttendees() || numberOfAttendees > eventType.getMaximumNumberOfAttendees();
    }

    private String mapGiftType(int userInput) {
        return switch (userInput) {
            case 1 -> EventType.BIRTHDAY.getType();
            case 2 -> EventType.LUNCH.getType();
            case 3 -> EventType.DINNER.getType();
            default -> throw new IllegalStateException("Valor inesperado: " + userInput);
        };
    }

    public BirthdayEvent getBirthdayEventInput() {
        EventType eventType = EventType.BIRTHDAY;
        EventDefinition eventDefinition = EventDefinition.BIRTHDAY;
        //Name, age, favorite color, # of attendees time, gift format, upfront
        String name = getStringInput("Ingrese el nombre del cumpleaniero: ");
        int age = getIntInput("Ingrese el edad del cumpleaniero: ");
        String favoriteColor = getStringInput("Ingrese el color favorito del cumpleaniero: ");
        int numberOfAttendees;
        boolean isNumberOfAttendeesValid;
        do {
            numberOfAttendees = getIntInput("Ingrese el numero de invitados del evento: ");
            isNumberOfAttendeesValid = validateNumberOfAttendees(numberOfAttendees, eventType);
            if (!isNumberOfAttendeesValid) {
                System.out.println("Numero de invitados invalido, minimo: " + eventType.getMinimumNumberOfAttendees()
                        + ", maximo: " + eventType.getMaximumNumberOfAttendees());
            }
        } while (!isNumberOfAttendeesValid);
        int integerGiftType;
        boolean isGiftTypeValid;
        do {
            integerGiftType = getIntInput("Ingrese el formato de regalo: ");
            isGiftTypeValid = integerGiftType > 0 && integerGiftType < 4;
            if (!isGiftTypeValid) {
                System.out.println("Formato invalido, elija un valor entre 1 y 3");
            }
        } while (!isGiftTypeValid);
        String giftType = mapGiftType(integerGiftType);
        int upfrontPayment;
        do {
            upfrontPayment = getIntInput("Ingrese el valor del anticipo: ");
            if (upfrontPayment < 0) {
                System.out.println("Por favor, ingrese un valor mayor que 0");
            }
        } while (upfrontPayment < 0);
        return new BirthdayEvent(
                eventDefinition.getCode(),
                eventDefinition.getPrice(),
                numberOfAttendees,
                this.menuService.getRegularMenu(numberOfAttendees),
                name,
                age,
                favoriteColor,
                giftType
        );
    }

    private String mapDressCode(int userInput) {
        return switch (userInput) {
            case 1 -> DressCode.FORMAL.getType();
            case 2 -> DressCode.CASUAL.getType();
            default -> throw new IllegalStateException("Valor inesperado: " + userInput);
        };
    }

    private EventDefinition mapCorporateEventType(int userInput) {
        EventDefinition eventDefinition;
        return switch (userInput) {
            case 1 -> eventDefinition = EventDefinition.CORPORATE_LUNCH;
            case 2 -> eventDefinition = EventDefinition.CORPORATE_DINNER;
            default -> throw new IllegalStateException("Valor inesperado: " + userInput);
        };
    }

    private EventDefinition mapFamilyEventType(int userInput) {
        EventDefinition eventDefinition;
        return switch (userInput) {
            case 1 -> eventDefinition = EventDefinition.FAMILY_LUNCH;
            case 2 -> eventDefinition = EventDefinition.FAMILY_DINNER;
            default -> throw new IllegalStateException("Valor inesperado: " + userInput);
        };
    }

    public CorporateEvent getCorporateEventInput() {
        //Type company name and dress code, hasDesserts :P
        String companyName = getStringInput("Ingrese el nombre de la compania: ");
        int integerEventType;
        do {
            System.out.println("Para ingresar el tipo de evento use 1 (Almcuerzo) o 2 (Cena)");
            integerEventType = getIntInput(": ");
            if (integerEventType < 1 || integerEventType > 2) {
                System.out.println("Por favcr, ingrese 1 o 2");
            }
        } while (integerEventType < 1 || integerEventType > 2);
        EventDefinition eventDefinition = mapCorporateEventType(integerEventType);
        EventType eventType;
        if (integerEventType == 1) {
            eventType = EventType.LUNCH;
        } else eventType = EventType.DINNER;
        int numberOfAttendees;
        boolean isNumberOfAttendeesValid;
        do {
            numberOfAttendees = getIntInput("Ingrese el numero de invitados del evento: ");
            isNumberOfAttendeesValid = validateNumberOfAttendees(numberOfAttendees, eventType);
            if (!isNumberOfAttendeesValid) {
                System.out.println("Numero de invitados invalido, minimo: " + eventType.getMinimumNumberOfAttendees()
                        + ", maximo: " + eventType.getMaximumNumberOfAttendees());
            }
        } while (!isNumberOfAttendeesValid);
        int integerDressCode;
        do {
            System.out.println("Para ingresar el codigo de vestimenta, ingrese 1 (Formal) o 2 (Casual)");
            integerDressCode = getIntInput(": ");
            if (integerDressCode < 1 || integerDressCode > 2) {
                System.out.println("Por favcr, ingrese 1 o 2");
            }
        } while (integerDressCode < 1 || integerDressCode > 2);
        String dressCode = mapDressCode(integerDressCode);
        return new CorporateEvent(
                eventDefinition.getCode(),
                eventDefinition.getPrice(),
                numberOfAttendees,
                this.menuService.getRegularMenu(numberOfAttendees),
                eventType.getType(),
                companyName,
                dressCode
        );
    }

    public FamilyEvent getFamilyEventInput() {
        int integerEventType;
        do {
            System.out.println("Para ingresar el tipo de evento use 1 (Almcuerzo) o 2 (Cena)");
            integerEventType = getIntInput(": ");
            if (integerEventType < 1 || integerEventType > 2) {
                System.out.println("Por favcr, ingrese 1 o 2");
            }
        } while (integerEventType < 1 || integerEventType > 2);
        EventDefinition eventDefinition = mapFamilyEventType(integerEventType);
        EventType eventType;
        if (integerEventType == 1) {
            eventType = EventType.LUNCH;
        } else eventType = EventType.DINNER;
        int numberOfAttendees;
        boolean isNumberOfAttendeesValid;
        do {
            numberOfAttendees = getIntInput("Ingrese el numero de invitados del evento: ");
            isNumberOfAttendeesValid = validateNumberOfAttendees(numberOfAttendees, eventType);
            if (!isNumberOfAttendeesValid) {
                System.out.println("Numero de invitados invalido, minimo: " + eventType.getMinimumNumberOfAttendees()
                        + ", maximo: " + eventType.getMaximumNumberOfAttendees());
            }
        } while (!isNumberOfAttendeesValid);
        return new FamilyEvent(
                eventDefinition.getCode(),
                eventDefinition.getPrice(),
                numberOfAttendees,
                this.menuService.getRegularMenu(numberOfAttendees),
                eventType.getType()
        );
    }
}
