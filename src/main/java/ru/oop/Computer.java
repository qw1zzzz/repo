package ru.oop;

public class Computer {
    private boolean multiMonitor;
    private int ssd;
    private String cpu;

    public Computer(boolean multiMonitor, int ssd, String cpu) {
        this.multiMonitor = multiMonitor;
        this.ssd = ssd;
        this.cpu = cpu;
    }

    public Computer() {
    }

    public void printInfo() {
        System.out.println("Много мониторов: " + multiMonitor);
        System.out.println("SSD: " + ssd + " GB");
        System.out.println("Модель CPU: " + cpu);
    }

    public static void main(String[] args) {
        Computer computer = new Computer(true, 512, "Intel Core i7-13500k");
        computer.printInfo();
        System.out.println();
        Computer comp = new Computer(false, 1024, "AMD Ryzen 5600X");
        comp.printInfo();
        System.out.println();
        Computer zeroComp = new Computer();
        zeroComp.printInfo();
    }
}