package com.company;

import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = 16;
        int y = 8;
        int z = 50;

        System.out.println("Введите любое число");
        int Number = sc.nextInt();

        if ((Number==x)||(Number==z)||(Number==y)) {
            System.out.println("Данное значение имеется в константах");
        }

            else  {
                System.out.println ("Такой константы нет!");
        }
    }
}

