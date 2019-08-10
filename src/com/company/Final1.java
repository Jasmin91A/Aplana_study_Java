package com.company;

import java.util.Scanner;

public class Final1 {
    public static void main(String args[]) {

        Scanner sс = new Scanner(System.in);
        System.out.println("Введите бинарное число: ");
        int a = sс.nextInt();
        int dec = 0, b = 0;

        while (a != 0)
        {
            dec += ((a % 10) * Math.pow(2, b));
            a = a / 10;
            b++;
        }

        System.out.printf("Число в десятичном формате:\n%d", dec);
    }
}
