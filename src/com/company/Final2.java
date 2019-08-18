package com.company;

import java.util.Scanner;

public class Final2 {
    public static void main(String[] args) {
        int a;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        a = in.nextInt();
        int[] array = new int [a];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите элемент arr[" + i + "]:");
            array[i] = in.nextInt();
        }
        int[] b = new Final2().shellSorting(array);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
    public int[] shellSorting(int[] array) {
        int h = 1;
        int n = array.length;
        while (h < n / 3)
            h = 3 * h + 1;

        while (h >= 1) {
            for (int i = h; i < array.length; i++) {
                for (int j = i; j >= h && array[j] > array[j - h]; j -= h) {
                    int temp = array[j];
                    array[j] = array[j - h];
                    array[j - h] = temp;
                }
            }
            h = h / 3;
        }
        return array;
    }
}