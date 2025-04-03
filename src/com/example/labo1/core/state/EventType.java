package com.example.labo1.core.state;

public enum EventType {
    BIRTHDAY("Cumpleanios", 50, 75),
    DINNER("Cena", 4 , 15),
    LUNCH("Almuerzo", 10, 40);

    private final String type;
    private final int minimumNumberOfAttendees;
    private final int maximumNumberOfAttendees;

    EventType(String type, int minimumNumberOfAttendees, int maximumNumberOfAttendees) {
        this.type = type;
        this.minimumNumberOfAttendees = minimumNumberOfAttendees;
        this.maximumNumberOfAttendees = maximumNumberOfAttendees;
    }

    public String getType() {
        return type;
    }

    public int getMinimumNumberOfAttendees() {
        return minimumNumberOfAttendees;
    }

    public int getMaximumNumberOfAttendees() {
        return maximumNumberOfAttendees;
    }
}
