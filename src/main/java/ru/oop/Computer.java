package ru.oop;

public class Computer {
    private boolean multiMonitor;
    private int ssd;
    private String cpu;

    public Computer() {

    }

    public Computer(boolean multiMonitor, int ssd, String cpu) {
        this.multiMonitor = multiMonitor;
        this.ssd = ssd;
        this.cpu = cpu;
    }

    public Computer(int ssd, String cpu) {
        this.ssd = ssd;
        this.cpu = cpu;
    }

    public Computer(boolean multiMonitor, double ssd, String cpu) {
        this.multiMonitor = multiMonitor;
        this.ssd = (int) ssd;
        this.cpu = cpu;
    }

    public void printInfo() {
        System.out.println("MultiMonitor: " + multiMonitor);
        System.out.println("SSD: " + ssd + " GB");
        System.out.println("CPU: " + cpu);
        System.out.println();
    }

    public static void main(String[] args) {
        Computer first = new Computer();
        first.printInfo();
        Computer second = new Computer(true, 512, "AMD Ryzen 5");
        second.printInfo();
        Computer third = new Computer(1024, "Intel Core i7-13700k");
        third.printInfo();
        Computer forth = new Computer(false, 512.0, "Amd Ryzen 5600X");
        forth.printInfo();
    }
}