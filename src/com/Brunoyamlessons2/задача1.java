package com.brunoyam.lesson2;

import java.util.Scanner;

public class задача1 {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);

        int a = numbers.nextInt();
        int b = numbers.nextInt();

        if (a % b == 0) {
            System.out.print("да");
        } else
            System.out.println("нет");

    }
}