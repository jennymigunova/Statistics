package ru.netology.stats;

public class Statistics {
    public void sum() {
           int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
           int allSalesSum = 0;
           for (int sale : sales){
               allSalesSum +=sale;
           }
        System.out.println(allSalesSum);
    }

    public void middleSum() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int allSalesSum = 0;
        int middleSalesSumPerMonth = 0;
        for (int sale : sales) {
            allSalesSum += sale;
        }
        middleSalesSumPerMonth = allSalesSum/sales.length;
        System.out.println(middleSalesSumPerMonth);
    }

    public void maxSum() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
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
        System.out.println(numberOfMonthWithMaxSalesSum);

    }

    public void minSum() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int numberOfMonthWithMinSalesSum = 0;
        int minSale = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (minSale > sales[i]) {
                minSale = sales[i];
                numberOfMonthWithMinSalesSum = i;
            }
        }
        System.out.println(numberOfMonthWithMinSalesSum);

    }

    public void belowMidSum() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int amountOfMonthsBelowMidSum = 0;
        int middleSalesSumPerMonth = 15;
        for (int sale : sales) {
            if (sale < middleSalesSumPerMonth) {
                amountOfMonthsBelowMidSum += 1;
            }
        }
        System.out.println(amountOfMonthsBelowMidSum);
    }

    public void overMidSum() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int amountOfMonthsOverMidSum = 0;
        int middleSalesSumPerMonth = 15;
        for (int sale : sales) {
            if (sale < middleSalesSumPerMonth) {
                amountOfMonthsOverMidSum += 1;
            }
        }
        System.out.println(amountOfMonthsOverMidSum);
    }
}
