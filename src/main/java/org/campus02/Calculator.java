package org.campus02;

public class Calculator {
    private String name;

    public Calculator(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public double difference(double a, double b) {
        return a - b;
    }

    public double product(double a, double b) {
        return a * b;
    }

    public double quotient(double a, double b) {
        return a / b;
    }

}
