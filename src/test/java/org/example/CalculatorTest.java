package org.example;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void add_return_4_whenAis_2_and_Bis_2() {
        //GIVEN
        int a = 2;
        int b = 2;
        int expected = 4;
        //WHEN
        int actual = a + b;
        //THEN
        assertEquals(expected,actual);

    }

    @org.junit.jupiter.api.Test
    void subtraktion_return_0_when_aIs_2_and_bIs_2() {
        //GIVEN
        int a = 5;
        int b = 2;
        int expected = 3;
        //WHEN
        int actual = a - b;
        //THEN
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void multiplikation_return_12_when_aIs_6_and_bIs2() {
        //GIVEN
        int a = 6;
        int b = 2;
        int expected = 12;
        //WHEN
        int actual = a * b;
        //THEN
        assertEquals(expected,actual);

    }

    @org.junit.jupiter.api.Test
    void division_return_6_when_aIs36_and_bIs_6() {
        //GIVEN
        int a = 36;
        int b = 6;
        int expected = 6;
        //WHEN
        int actual = a / b;
        //THEN
        assertEquals(expected,actual);

    }
}