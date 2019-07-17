package com.company;

import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] agrs)
    {
        int i = 0;
        int a;

        Scanner sc = new Scanner(System.in);
            System.out.print("Введите длину массива: ");
            a = sc.nextInt();

        int [] num = new int [a];

       for (int ignored : num) {
           System.out.print("Введите " + (i + 1) + "-й элемент массива: ");
            num[i] = sc.nextInt();

            System.out.println(num[i] + "*2" + "=" + num[i]*2);

            i++;
        }
    }
}
