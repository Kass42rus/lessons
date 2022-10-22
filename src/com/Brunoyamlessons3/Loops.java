package com.Brunoyamlessons3;

public class Loops {
    public static void main(String[] args) {
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");

//        int n = 0;
//        while (n <= 3) {
//            System.out.println("Hello World");
//            n++; // увеличит на 1 цикл
//        }

        int y, x = 0;

//        Инкремент
        y = x++; // Постфиксная форма
        System.out.println("x = " + x + ", y = " + y);

        y = ++x; // префиксная форома
        System.out.println("x = " + x + ", y = " + y);

        // декремент
        y = x--;
        System.out.println("x = " + x + ", y = " + y);

        y = --x;
        System.out.println("x = " + x + ", y = " + y);
    }
}