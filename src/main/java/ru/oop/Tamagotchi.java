package ru.oop;

public class Tamagotchi {
    private int weight = 100;

    public void feed() {
        weight += 10;
    }

    public static void feedPet(Tamagotchi petCopy) {
        petCopy.feed();
    }

    public String info() {
        return "weight - " + weight;
    }

    public static void main(String[] args) {
        Tamagotchi pet = new Tamagotchi();
        Tamagotchi petCopy = pet;
        petCopy.feed();
        System.out.println("weight: " + pet.info());
        feedPet(pet);
        System.out.println("weight: " + pet.info());
    }
}
