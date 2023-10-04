package ru.netology.services;


public class Main {
    public static void main(String[] args) {
        SaleService service = new SaleService();
        int[] sales = {
                22, 30, 13, 15, 17, 20, 19, 21, 2, 12, 14, 18
        };
        int minMonthSales = service.minMonthSales(sales);
        int maxMonthSales = service.maxMonthSales(sales);
        int SumOfAllSales = service.SumSales(sales);
        int Averagenumberofsales = service.averageSales(sales);
        int minAverageMonthSales = service.minAverageMonthSales(sales);
        int maxAverageMonthSales = service.maxAverageMonthSales(sales);
        System.out.println("Количество месяцев, в которых продажи были ниже среднего: " + minAverageMonthSales);
        System.out.println("Количество месяцев, в которых продажи были выше среднего: " + maxAverageMonthSales);
        System.out.println("Среднее число продаж: " + Averagenumberofsales);
        System.out.println("Сумма всех продаж составляет: " + SumOfAllSales);
        System.out.println("Минимальные продажи в: " + minMonthSales + "м месяце");
        System.out.println("Максимальные продажи в: " + maxMonthSales + "м месяце");
    }
}