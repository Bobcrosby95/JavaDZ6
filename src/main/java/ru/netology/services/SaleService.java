package ru.netology.services;

import java.util.Arrays;

public class SaleService {
    public int minMonthSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int maxMonthSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minAverageMonthSales(int[] sales) {
        int average = 0;
        if (sales.length > 0)
        {
            int sum = 0;
            for (int j = 0; j < sales.length; j++) {
                sum += sales[j];
            }
            average = sum / sales.length;
        }

        int month = 0;
        for (int i = 0; i < sales.length ; i++) {
            if (average > sales[i]) {
                month++;
            }
        }

        return month;
    }

    public int maxAverageMonthSales(int[] sales) {
        int average = 0;
        if (sales.length > 0)
        {
            int sum = 0;
            for (int j = 0; j < sales.length; j++) {
                sum += sales[j];
            }
            average = sum / sales.length;
        }

        int month = 0;
        for (int i = 0; i < sales.length ; i++) {
            if (average < sales[i]) {
                month++;
            }
        }

        return month;
    }

    public int SumSales(int[] sales) {
        int[] AllSales = sales;
        int total = Arrays.stream(AllSales).sum();

        return total;
    }

    public int averageSales(int[] sales) {
        int average = 0;
        if (sales.length > 0)
        {
            int sum = 0;
            for (int j = 0; j < sales.length; j++) {
                sum += sales[j];
            }
            average = sum / sales.length;
        }
        return average;
    }
}
