package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

    public class Zadanie16 {

        public static void main(String[] args) {
            String s;
            try (BufferedReader br = new BufferedReader(new FileReader("/Users/jasmin_91/Desktop/Zadanie16")))
            {
                while ((s=br.readLine())!=null)
                {
                    System.out.println(s);
                }
            } catch (IOException exc)
            {
                System.out.println("Ошибка ввода-вывода: " + exc);
            }
        }
    }

