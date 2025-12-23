package ru.netology.Qa126.JavaQaHomework5.services;

public class RestService {

    public int calcMonth(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                count++;
                money = (money - expenses) - 2 * (money - expenses) / 3;
            } else {
                money = money + income - expenses;
            }

        }
        return count;

    }
}
