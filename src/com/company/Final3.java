package com.company;

import java.util.Scanner;

public class Final3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текущий курс доллара:");
        double exchangerates = sc.nextDouble();

        System.out.println("Введите сумму в рублях:");
        double rub = sc.nextDouble();

        double dollar = rub / exchangerates;

        System.out.printf("После конвертвции из RUB в USD вы получите следующую сумму: %.2f " + "$", dollar);

    }
}

