package com.company;

import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] agrs) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите длину массива: ");
            int a = in.nextInt();
            int num[] = new int[a];

            System.out.println("Ведите значения массива:");
            for (int i = 0; i < a; i++)
            {
                num[i] = in.nextInt () * 2;
            }

            System.out.println ("Значения в массиве:");
            for (int i = 0; i < a; i++)
            {
                System.out.println (num[i]);
            }

        }
    }