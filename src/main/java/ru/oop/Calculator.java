package ru.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int divide(int y) {
        return y / x;
    }

    public int sumAllOperation(int y) {
        return sum(y) + multiply(y) + minus(y) + divide(y);
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        System.out.println(result);

        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        System.out.println(rsl);

        int resSum = Calculator.sum(5);
        System.out.println(resSum);
        System.out.println();

        Calculator calculator1 = new Calculator();
        int resMul = calculator1.multiply(5);
        System.out.println(resMul);
        System.out.println();

        Calculator calculator2 = new Calculator();
        int resDev = calculator2.divide(5);
        System.out.println(resDev);
        System.out.println();

        Calculator sumCal = new Calculator();
        int resAllSum = sumCal.sumAllOperation(5);
        System.out.println(resAllSum);
    }
}
