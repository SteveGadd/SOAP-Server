package com.example.server;

public class Person {
    private String name,surname;
    private final int TCKN;

    public Person(String name, String surname, int TCKN) {
        this.name = name;
        this.surname = surname;
        this.TCKN = TCKN;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getTCKN() {
        return TCKN;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
