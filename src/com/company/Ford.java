package com.company;

public class Ford extends Car implements Printable{

    public Ford(int age, int mass, String color, String name ) {
        super(age, mass, color, name);
    }

    @Override
    public void print() {
        super.print();
        System.out.println(
               "age: " +getAge() + "\n" +
               "color: " +getColor() + "\n" +
               "mass: " +getMass() + "\n" +
               "name: " +getName());
    }
}
