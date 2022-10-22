package com.brunoyam.lesson2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner scannerfinder = new Scanner(System.in);

        System.out.print("Введите целое число:  ");
        int input = scannerfinder.nextInt();
        System.out.println("Вы ввели: " + input);

        System.out.print("Введите ваше имя: ");
        String name = scannerfinder.next();
        System.out.println("Ваше имя:  " + name);

        scannerfinder.nextLine();

        System.out.print("Введите ваше ФИО:  ");
        String fio = scannerfinder.nextLine();
        System.out.println("Ваше ФИО   " + fio);
    }
}