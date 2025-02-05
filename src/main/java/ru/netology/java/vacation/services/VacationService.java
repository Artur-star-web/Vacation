package ru.netology.java.vacation.services;

public class VacationService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету

        for (int month = 1; month <= 12; month++) {
            System.out.println("Месяц " + month + ". Денег: " + money);

            if (money >= threshold) { // можем ли отдыхать?
                System.out.println("Буду отдыхать.");
                count++; // увеличиваем счётчик месяцев отдыха
                money -= expenses; // списываем обязательные расходы
                money = money - (money / 3 * 2); // корректное вычисление расходов на отдых
            } else { // если недостаточно средств — работаем
                System.out.println("Придётся работать.");
                money += income; // заработок
                money -= expenses; // обязательные расходы
            }
            System.out.println("В конце месяца денег осталось: " + money);
        }
        return count;
    }
}