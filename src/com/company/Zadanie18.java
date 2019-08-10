package com.company;

import java.io.*;

    public class Zadanie18 {
        public static void main(String[] args) {
            String r;
            int count = 0;

            try
            {
                FileInputStream fstream = new FileInputStream("/Users/jasmin_91/Desktop/Zadanie16");
                BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
                String strLine;
                while ((strLine = br.readLine()) != null)
                {
                    System.out.println(strLine);
                    {++count;}
                }

            } catch (IOException exc) {
                System.out.println("Ошибка ввода-вывода: " + exc);
            }

            System.out.println("Количество строк в файле = " + count);

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Чтобы завершить ввод данных - пропишите команду 'stop' ");

            try (FileWriter fw = new FileWriter("/Users/jasmin_91/Desktop/Zadanie16")) {
                while (count!=0){
                    System.out.println("");
                    r = br.readLine();
                    r = r +"\r\n";
                    fw.write(r);
                    count--;
                }
            }

            catch (IOException exc) {
                System.out.println("Ошибка ввода-вывода: " + exc);
            }
        }

    }