package ru.netology.stats;

public class StatsService {
    public int sum(int[] sales) {
        int allSalesSum = 0;
        for (int sale : sales) {
            allSalesSum += sale;
        }
        return allSalesSum;
    }

    public int middleSum(int[] sales) {
        if (sales.length == 0) return 0;
        return sum(sales) / sales.length;
    }

    public int maxSum(int[] sales) {
        if (sales.length == 0) return 0;
        int numberOfMonthWithMaxSalesSum = 0;
        int month = 0;
        int maxSale = sales[month];

        for (int sale : sales) {
            if (maxSale <= sale) {
                maxSale = sale;
                numberOfMonthWithMaxSalesSum = month;
            }
            month++;
        }
        return numberOfMonthWithMaxSalesSum;
    }

    public int minSum(int[] sales) {
        if (sales.length == 0) return 0;
        int numberOfMonthWithMinSalesSum = 0;
        int minSale = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (minSale > sales[i]) {
                minSale = sales[i];
                numberOfMonthWithMinSalesSum = i;
            }
        }
        return numberOfMonthWithMinSalesSum;

    }

    public int belowMidSum(int[] sales) {
        int amountOfMonthsBelowMidSum = 0;
        for (int sale : sales) {
            if (sale < middleSum(sales)) {
                amountOfMonthsBelowMidSum++;
            }
        }
        return amountOfMonthsBelowMidSum;
    }

    public int overMidSum(int[] sales) {
        int amountOfMonthsOverMidSum = 0;
        for (int sale : sales) {
            if (sale < middleSum(sales)) {
                amountOfMonthsOverMidSum++;
            }
        }
        return amountOfMonthsOverMidSum;
    }
}
