package com.brunoyam.lesson2;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        //условыный оператор if

        System.out.println("На улице идет дождь");
        System.out.println("Если да, то введите 'true' ");
        System.out.println("елси нет, то введите 'false' ");

        Scanner writer = new Scanner (System.in);

        boolean isRaining = writer.nextBoolean();

        if (isRaining) {
            System.out.println("Берем зонт");
        } else {
            System.out.println("не нужен зонт");




        }
    }
}