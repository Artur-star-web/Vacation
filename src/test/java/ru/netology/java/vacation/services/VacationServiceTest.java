package ru.netology.java.vacation.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VacationServiceTest {

    @Test
    void testCalculateWithExampleOne() {
        VacationService service = new VacationService();
        int actual = service.calculate(10000, 3000);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testCalculateWithExampleTwo() {
        VacationService service = new VacationService();
        int actual = service.calculate(100000, 60000);
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }
}