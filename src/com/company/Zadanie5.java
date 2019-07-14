package com.company;

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое число: ");
        int num = sc.nextInt();


        int a = 1 * num;
        int b = 2 * num;
        int c = 3 * num;
        int d = 4 * num;
        int e = 5 * num;
        int f = 6 * num;
        int g = 7 * num;
        int h = 8 * num;
        int i = 9 * num;
        int j = 10 * num;

        System.out.println("Таблица умножения на число "  + num + ":" + "\n" +
                "1 * " + num + " = " + a + "\n" +
                "2 * " + num + " = " + b + "\n" +
                "3 * " + num + " = " + c + "\n" +
                "4 * " + num + " = " + d + "\n" +
                "5 * " + num + " = " + e + "\n" +
                "6 * " + num + " = " + f + "\n" +
                "7 * " + num + " = " + g + "\n" +
                "8 * " + num + " = " + h + "\n" +
                "9 * " + num + " = " + i + "\n" +
                "10 * " + num + " = " + j + "\n");

    }
}
