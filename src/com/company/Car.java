package com.company;

public class Car implements Printable {

    private int age;
    private int mass;
    private String color;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car(int age, int mass, String color, String name) {
        this.age = age;
        this.mass = mass;
        this.color = color;
        this.name = name;
    }

    @Override
    public void print() {

    }
}
