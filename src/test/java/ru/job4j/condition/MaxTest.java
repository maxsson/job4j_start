package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 10;
        int right = 10  ;
        int result = Max.max(left, right);
        int expected = 10;
        assertEquals(result, expected);
    }
}