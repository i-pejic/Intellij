package org.campus02;

public class DemoApp {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator("Testrechner");

        System.out.println("Name des Rechners: = " + myCalculator.getName());

        System.out.println("5.2 + 10.4: " + myCalculator.sum(5.2, 10.4));

    }
}
