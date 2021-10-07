package com.company;

public class Toyota extends Car implements Printable{

    public Toyota(int age, int mass, String color, String name) {
        super(age, mass, color, name);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("________________________");
        System.out.println(
               "age: " +getAge() + "\n" +
               "color: " +getColor() + "\n" + "mass: " +getMass() + "\n" + "name: " +getName());
        System.out.println("________________________");
    }
}
