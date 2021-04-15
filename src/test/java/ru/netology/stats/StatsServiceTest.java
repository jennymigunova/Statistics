package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsService stat = new StatsService();

    @Test
    void sum() {
        assertEquals(180, stat.sum(sales));
        assertEquals(20, stat.sum(new int[]{10, 10}));
        assertEquals(0, stat.sum(new int[]{-10, 10}));
        assertEquals(-1, stat.sum(new int[]{0, -1}));
        assertEquals(0, stat.sum(new int[]{}));
    }

    @Test
    void middleSum() {
        assertEquals(15, stat.middleSum(sales));
        assertEquals(2, stat.middleSum(new int[]{1, 2, 3}));
        assertEquals(-5, stat.middleSum(new int[]{-20, 10}));
        assertEquals(-1, stat.middleSum(new int[]{0, -2}));
        assertEquals(0, stat.middleSum(new int[]{}));
    }

    @Test
    void maxSum() {
        assertEquals(7, stat.maxSum(sales));
        assertEquals(0, stat.maxSum(new int[]{}));
        assertEquals(1, stat.maxSum(new int[]{0, 0}));
        assertEquals(0, stat.maxSum(new int[]{-1, -5}));
        assertEquals(2, stat.maxSum(new int[]{1, 2, 3}));
        assertEquals(1, stat.maxSum(new int[]{-6, 10, 3}));
    }

    @Test
    void minSum() {
        assertEquals(8, stat.minSum(sales));
        assertEquals(8, stat.minSum(new int[]{}));
        assertEquals(0, stat.minSum(new int[]{0, 0}));
        assertEquals(0, stat.minSum(new int[]{1, 2, 3}));
        assertEquals(0, stat.minSum(new int[]{-6, 10, 3}));
        assertEquals(2, stat.minSum(new int[]{-11, -5, -89}));
    }

    @Test
    void belowMidSum() {
        assertEquals(5, stat.belowMidSum(sales));
        assertEquals(0, stat.belowMidSum(new int[]{}));
        assertEquals(0, stat.belowMidSum(new int[]{0, 0}));
        assertEquals(1, stat.belowMidSum(new int[]{1, 2, 3}));
        assertEquals(1, stat.belowMidSum(new int[]{-6, 10, 3}));

    }

    @Test
    void overMidSum() {
        assertEquals(5, stat.overMidSum(sales));
        assertEquals(0, stat.overMidSum(new int[]{}));
        assertEquals(0, stat.overMidSum(new int[]{0, 0}));
        assertEquals(1, stat.overMidSum(new int[]{1, 2, 3}));
        assertEquals(1, stat.overMidSum(new int[]{-6, 10, 3}));
    }
}