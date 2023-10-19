package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SaleServiceTest {

    @Test
    public void shouldFindminMonthSales() {
        SaleService service = new SaleService();

        long[] minMonth = {22, 30, 13, 15, 17, 20, 19, 21, 2, 12, 14, 18};

        int expected = 9;
        long actual = service.minMonthSales(minMonth);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindmaxMonthSales() {
        SaleService service = new SaleService();

        long[] maxMonth = {22, 30, 13, 15, 17, 20, 19, 21, 2, 12, 14, 18};

        int expected = 2;
        long actual = service.maxMonthSales(maxMonth);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindaverageSales() {
        SaleService service = new SaleService();

        long[] averge = {22, 30, 13, 15, 17, 20, 19, 21, 2, 12, 14, 18};

        int expected = 16;
        long actual = service.averageSales(averge);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindaverageminMonthSales() {
        SaleService service = new SaleService();

        long[] minMonthAverge = {22, 30, 13, 15, 17, 20, 19, 21, 2, 12, 14, 18};

        int expected = 5;
        long actual = service.minAverageMonthSales(minMonthAverge);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindaveragemaxMonthSales() {
        SaleService service = new SaleService();

        long[] maxMonthAverge = {22, 30, 13, 15, 17, 20, 19, 21, 2, 12, 14, 18};

        int expected = 7;
        long actual = service.maxAverageMonthSales(maxMonthAverge);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindSumOfAllSales() {
        SaleService service = new SaleService();

        long[] sum = {22, 30, 13, 15, 17, 20, 19, 21, 2, 12, 14, 18};

        int expected = 203;
        long actual = service.sumSales(sum);

        Assertions.assertEquals(expected, actual);
    }
}
