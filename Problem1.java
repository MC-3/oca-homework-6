package com.sckeedoo.certification;

public class Problem1 {

    static class Animal {
        String name;
        int numberOfLegs;
        double weight;
    }

    /**
     * Create an Animal object. Give it a state (name, numberOfLegs, weight)
     * print the object in this format : ex Animal = {name='Mickey', age=110, numberOfLegs=2}
     *
     */
    public static void main(String[] args) {
    Animal Dog = new Animal();
    Dog.name = "Bobik";
    Dog.numberOfLegs = 4;
    Dog.weight = 42.8;
    System.out.println ("Animal = { Name = " + Dog.name + ", Weight = " + Dog.weight + ", Number of Legs = " + Dog.numberOfLegs + " }");
    }
}
