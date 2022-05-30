package ru.netology.stats;

public class StartsService {
    // 1. сумма всех продаж
    public long sum(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    // 2. средняя сумма продаж в месяц
    public long avg(long[] sales) {
        return sum(sales) / sales.length;
    }

    // 3. номер месяца минимальных продаж
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    //  4. номер месяца максимальных продаж
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    // 5. Кол-во месяцев, в продаже было два раза ниже среднего
    public int twoBelowAvg(long[] sales) {
        long avg1 = avg(sales);
        int belowMaxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale < avg1) {
                belowMaxMonth = month;
            }
            month = month + 2;
        }
        return belowMaxMonth + 2;
    }

    // 6. Кол-во месяцев, в которых продажи были выше среднего
    public int AboveAvg(long[] sales) {
        long avg2 = avg(sales);
        int AboveAvg = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale > avg2) {
                AboveAvg = month;
            }
            month = month + 1;
        }
        return AboveAvg + 1;
    }
}