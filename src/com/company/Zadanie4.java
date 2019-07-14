package com.company;

import java.util.Scanner;

public class Zadanie4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите бинарное число: ");
        String bin = sc.nextLine();
        int binNum = Integer.parseInt(bin, 2);

        System.out.println(binNum);
    }

}

