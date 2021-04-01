package ru.netology.stats;

public class Statistics {
    public int sum(int[] sales) {
        int allSalesSum = 0;
        for (int sale : sales){
            allSalesSum +=sale;
        }
        return allSalesSum;
    }

    public int middleSum(int[] sales) {
        int allSalesSum = 0;
        int middleSalesSumPerMonth = 0;
        for (int sale : sales) {
            allSalesSum += sale;
        }
        middleSalesSumPerMonth = allSalesSum/sales.length;
        return middleSalesSumPerMonth;
    }

    public int maxSum(int[] sales) {
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
        int middleSalesSumPerMonth = 15;
        for (int sale : sales) {
            if (sale < middleSalesSumPerMonth) {
                amountOfMonthsBelowMidSum += 1;
            }
        }
        return amountOfMonthsBelowMidSum;
    }

    public int overMidSum(int[] sales) {
        int amountOfMonthsOverMidSum = 0;
        int middleSalesSumPerMonth = 15;
        for (int sale : sales) {
            if (sale < middleSalesSumPerMonth) {
                amountOfMonthsOverMidSum += 1;
            }
        }
        return amountOfMonthsOverMidSum;
    }
}
