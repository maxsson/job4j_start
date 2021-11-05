package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;


public class MultipleSwitchWeekTest {

    @Test
    public void numberOfDayTest() {
          String dayOfWeek = "Thursday";
        int result = MultipleSwitchWeek.numberOfDay(dayOfWeek);
        int expectedDay = -1;
        assertEquals(expectedDay, result);
    }
}