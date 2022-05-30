package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StartsServiceTest {

    // 1. сумма всех продаж
    @Test
    public void shouldSum() {
        StartsService service = new StartsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.sum(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(expected, actual);
    }

    // 2. средняя сумма продаж в месяц
    @Test
    public void shouldAvg() {
        StartsService service = new StartsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.avg(sales);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;

        Assertions.assertEquals(expected, actual);
    }

    // 3. номер месяца минимальных продаж
    @Test
    public void shouldMinSales() {
        StartsService service = new StartsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.minSales(sales);
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    // 4. номер месяца максимальных продаж
    @Test
    public void shouldMaxSales() {
        StartsService service = new StartsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.maxSales(sales);
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    // 5. Кол-во месяцев, в продаже было два раза ниже среднего
    @Test
    public void shouldTwoBelowAvg() {
        StartsService service = new StartsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.twoBelowAvg(sales);
        int expected = 2;
    }

    // 6. Кол-во месяцев, в которых продажи были выше среднего
    @Test
    public void shouldAboveAvg() {
        StartsService service = new StartsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.AboveAvg(sales);
        long expected = 1;
    }
}