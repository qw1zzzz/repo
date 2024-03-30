package ru.oop;

public class Student {
    public void music(String lyrics) {
        System.out.println("I can sing a song: " + lyrics);
    }
    public void sing() {
        System.out.println("I beleve i can fly");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        Student vasya = new Student();
        String song = "be be be";
        petya.music("tra tra tra");
        petya.music("La la la");
        petya.music("me me me");
        petya.music(song);
        petya.sing();
        petya.sing();
        petya.sing();
    }
}
