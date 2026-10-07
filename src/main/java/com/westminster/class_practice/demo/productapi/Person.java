package com.westminster.class_practice.demo.productapi;

public class Person {
    private int id;
    private String name;
    private String birthDate;
    public Person(int id, String name, String birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }
    public String getAge() {
        return id + " " + name + " " + birthDate;
        }
}
