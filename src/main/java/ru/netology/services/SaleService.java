package ru.netology.services;

public class SaleService {
    public long minMonthSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public long maxMonthSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public long minAverageMonthSales(long[] sales) {
        long average = averageSales(sales);
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (average > sales[i]) {
                month++;
            }
        }
        return month;
    }

    public long maxAverageMonthSales(long[] sales) {
        long average = averageSales(sales);
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (average < sales[i]) {
                month++;
            }
        }
        return month;
    }

    public long sumSales(long[] sales) {
        long sum = 0;
        if (sales.length > 0) {
            for (int j = 0; j < sales.length; j++) {
                sum += sales[j];
            }
        }
        return sum;
    }

    public long averageSales(long[] sales) {
        long sum = sumSales(sales);
        long average = sum / 12;
        return average;
    }
}
