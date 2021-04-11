package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsService stat = new StatsService();

    @Test
    void sum() {
        int actual = stat.sum(sales);
        int expected = 180;
        assertEquals(expected, actual);
    }

    @Test
    void middleSum() {
        int actual = stat.middleSum(sales);
        int expected = 15;
        assertEquals(expected, actual);
    }


    @Test
    void maxSum() {
        int actual = stat.maxSum(sales);
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    void minSum() {
        int actual = stat.minSum(sales);
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void belowMidSum() {
        int actual = stat.belowMidSum(sales);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void overMidSum() {
        int actual = stat.overMidSum(sales);
        int expected = 5;
        assertEquals(expected, actual);
    }
}