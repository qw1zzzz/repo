package ru.oop;

public class Cat
{
    public String sound(){
        String voice = "miu-miu";
        return voice;
    }
    public static void main(String[] args)
    {
        Cat peppy = new Cat();
        Cat sparky = new Cat();
        String say = peppy.sound();
        System.out.println("Peppy says " + say);
    }
}
