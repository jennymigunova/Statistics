package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsTest {

    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    Statistics stat = new Statistics();

    @Test
    void sum() {
        int actual = stat.sum(sales);
        int expected = 180;
        assertEquals(expected,actual);

    }

    @Test
    void middleSum() {
    }

    @Test
    void maxSum() {
    }

    @Test
    void minSum() {
    }

    @Test
    void belowMidSum() {
    }

    @Test
    void overMidSum() {
    }
}