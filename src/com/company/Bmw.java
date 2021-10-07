package com.company;

public class Bmw extends Car implements Printable {

    public Bmw(int age, int mass, String color, String name) {
        super(age, mass, color, name);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("________________________");
        System.out.println("Age: " +getAge() + "\n" +
               "color: "  +getColor() + "\n" +
               "mass: " +getMass() + "\n" +
               "name: " +getName());
        System.out.println("________________________");
    }
}

