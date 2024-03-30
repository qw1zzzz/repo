package ru.oop;

public class Cat {
    private String food;
    private String name;
    public void eat(String meat) {
        this.food = meat;
    }
    public void giveNick(String nick) {
        this.name = nick;

    }
    public void show() {
        System.out.println(this.name + " eats " + this.food);
    }
    public String sound() {
        String voice = "miu-miu";
        return voice;
    }
    public static void main(String[] args) {
        System.out.println("There is gav's food.");
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.giveNick("gav");
        gav.show();

        System.out.println("There is black's food.");
        Cat black = new Cat();
        black.eat("fish");
        black.giveNick("black");
        black.show();

        Cat peppy = new Cat();
        Cat sparky = new Cat();
        String say = peppy.sound();
        System.out.println("Peppy says " + say);
    }
}
