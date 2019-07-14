package com.company;

import java.util.Scanner;


    public class Zadanie6 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Введите значение x");
            int x = sc.nextInt();

            System.out.println("Введите значение у");
            int y = sc.nextInt();

            System.out.println("Введите значение z");
            int z = sc.nextInt();

            int c = ((x + y + z) / 3);

            System.out.println("Среднее арифмитическое равно " + c);

            int d = c / 2;

            if (d > 3) {

                System.out.println("Программа выполнена корректно");

            }

        }
    }
