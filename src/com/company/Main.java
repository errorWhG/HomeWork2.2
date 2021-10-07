package com.company;

public class Main {

    public static void main(String[] args) {
        Car[] arrayCar = {createObject("M5"), createObject("Raptor"), createObject("Chaser")};
        for (Car i : arrayCar) {
            i.print();
        }
    }

    public static Car createObject(String className) {
    switch (className) {
        case "M5":
            Bmw M5 = new Bmw(5,1500, "Black", "Bmw");
            return M5;
        case "Raptor":
            Ford Raptor = new Ford( 2, 3000,"White", "Raptor");
            return Raptor;
        case "Chaser":
            Toyota Chaser = new Toyota(8, 1200, "Gray", "Chaser");
            return Chaser;
        }
        return null;
    }
}
