package com.company;

import java.util.Scanner;

public class Zadanie13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String one = sc.nextLine();

        System.out.println("Введите вторую строку: ");
        String two = sc.nextLine();

        int A = one.length();
        int B = two.length();

        if (A > B)
        {
            System.out.println("В этой строке больше символов: " + one);
        }
        else if (A < B)
        {
            System.out.println("В этой строке больше символов: " + two);
        }

    }
}
