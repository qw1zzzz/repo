package ru.oop;

public class Student {

    public void music(){
        System.out.println("La la la");
    }
    public void sing(){
        System.out.println("I beleve i can fly");
    }

    public static void main(String[] args){
        Student petya = new Student();
        petya.music();
        petya.music();
        petya.music();
        petya.sing();
        petya.sing();
        petya.sing();
    }
}
