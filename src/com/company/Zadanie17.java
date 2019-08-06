package com.company;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

    public class Zadanie17 {

        public static void main(String[] args)
        {
            String s;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Чтобы завершить ввод данных - пропишите команду 'stop' ");

            try (FileWriter fw = new FileWriter("/Users/jasmin_91/Desktop/Zadanie16"))
            {
                do
                {
                    System.out.print(": ");
                    s = br.readLine();

                    if (s.compareTo("stop")==0) break;
                    s = s + "\r\n";
                    fw.write(s);
                }
                while (s.compareTo("stop") !=0);
            }

            catch (IOException exc)
            {
                System.out.println("Ошибка ввода-вывода: " + exc);
            }
        }
    }

