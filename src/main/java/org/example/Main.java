package org.example;

public class Main {
    public static void main(String[] args) {

        // Erstellt ein testobjekt
        UebungStatic test = new UebungStatic();
        // Objekt ruft Methode incrementTotalCount() auf
        test.incrementTotalCount();
        // ruft nicht statische Variable auf
        System.out.println(test.instanceCount);

        System.out.println("#########################");

        // ruft getter der statischen Variable instanceCount auf
        System.out.println(UebungStatic.getTotalCount());

        // Verändert den Wert über den setter
        UebungStatic.setTotalCount(5);
        // ruft getter der statischen Variable instanceCount auf um den aktuellen Wert auszugeben
        System.out.println(UebungStatic.getTotalCount());


        System.out.println("#######Calculator########");

        /**
         *
         * statische methoden nicht aus instanz aufgerufen........
         */

        // Aufruf der Methode add() in Calculator:
        System.out.println(Calculator.add(1, 1));

        // Aufruf der Methode subtraktion() in Calculator:
        System.out.println(Calculator.subtraktion(8, 4));

        // Aufruf der Methode multiplikation() in Calculator:
        System.out.println(Calculator.multiplikation(6, 6));

        // Aufruf der Methode division() in Calculator:
        System.out.println(Calculator.division(12, 2));

        System.out.println("##############################");

        // Aufruf der toString Methode
        System.out.println(test);


    }
}