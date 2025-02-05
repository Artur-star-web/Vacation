package ru.netology.java.vacation.services;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VacationServiceTest {

    @Test
    public void testCalculate() {
        VacationService calculator = new VacationService();

        assertEquals(3, calculator.calculate(10000, 3000, 20000));
        assertEquals(2, calculator.calculate(100000, 60000, 150000));
    }
}
