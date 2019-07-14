package com.company;

import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] agrs)
    {
        int[] num = new int[4];
        int i = 0;
        Scanner in = new Scanner(System.in);

        for (int element: num) {

            System.out.print("Введите " + (i + 1) + "-й элемент массива: ");
            num[i] = in.nextInt();

            System.out.println(num[i] + "*2" + "=" + num[i]*2);

            i++;
        }
    }
}
