package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SaleServiceTest {

    @Test
    public void shouldFindminMonthSales() {
        SaleService service = new SaleService();

        int[] minMonth = {22, 30, 13, 15, 17, 20, 19, 21, 2, 12, 14, 18};

        int expected = 9;
        int actual = service.minMonthSales(minMonth);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindmaxMonthSales() {
        SaleService service = new SaleService();

        int[] maxMonth = {22, 30, 13, 15, 17, 20, 19, 21, 2, 12, 14, 18};

        int expected = 2;
        int actual = service.maxMonthSales(maxMonth);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindaverageSales() {
        SaleService service = new SaleService();

        int[] averge = {22, 30, 13, 15, 17, 20, 19, 21, 2, 12, 14, 18};

        int expected = 16;
        int actual = service.averageSales(averge);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindaverageminMonthSales() {
        SaleService service = new SaleService();

        int[] minMonthAverge = {22, 30, 13, 15, 17, 20, 19, 21, 2, 12, 14, 18};

        int expected = 5;
        int actual = service.minAverageMonthSales(minMonthAverge);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindaveragemaxMonthSales() {
        SaleService service = new SaleService();

        int[] maxMonthAverge = {22, 30, 13, 15, 17, 20, 19, 21, 2, 12, 14, 18};

        int expected = 7;
        int actual = service.maxAverageMonthSales(maxMonthAverge);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindSumOfAllSales() {
        SaleService service = new SaleService();

        int[] sum = {22, 30, 13, 15, 17, 20, 19, 21, 2, 12, 14, 18};

        int expected = 203;
        int actual = service.SumSales(sum);

        Assertions.assertEquals(expected, actual);
    }
}
