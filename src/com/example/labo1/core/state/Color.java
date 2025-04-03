package com.example.labo1.core.state;

//Colores favoritos que un cumpleaniero puede elegir.
public enum Color {
    RED("Red"),
    GREEN("Green"),
    BLUE("Blue"),
    YELLOW("Yellow"),
    BLACK("Black"),
    WHITE("White"),
    ORANGE("Orange"),
    PURPLE("Purple"),
    PINK("Pink");

    private final String name;

    Color(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

