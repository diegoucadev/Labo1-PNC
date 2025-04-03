package com.example.labo1.model;

/*
*
*   Clase utilizada para representar a la persona que realiza
*   una reserva, si el evento no se concreta, la persona queda
*   baneada del local por cierto periodo (ver la clase de BanRecord).
*
*/


import java.util.Optional;

public class Booker {
    private String firstName;
    private String lastName;
    //Numero de identificacion de fondo de bikini XD
    private String bbID;
    private String residence;
    private int age;
    private String phone;
    //Lugar de trabajo
    private String workplace;

    public Booker(String firstName, String lastName, String bbID, String residence, int age, String phone, String workplace) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bbID = bbID;
        this.residence = residence;
        this.age = age;
        this.phone = phone;
        this.workplace = workplace;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBbID() {
        return bbID;
    }

    public void setBbID(String bbID) {
        this.bbID = bbID;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Optional<String> getWorkplace() {
        return Optional.ofNullable(workplace);
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }
}
