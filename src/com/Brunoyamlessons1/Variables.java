package com.Brunoyamlessons1;

public class Variables {
    public static void main(String[] args) {

        int intvariables; // обьявляеем переменную ИНТ ЭТО ТИП КОРОБКИ  (ЦЕЛОЕ ЧИСЛО) ОБЬЯВЛЯЕЕМ ПЕРЕМЕНУЮ
        intvariables = 100; /* инициализируем переменную (УКАЗЫВАЕМ КОНКРЕТНОЕ ЧИСЛО - УКАЗЫВАЕМ НАИМЕНОВАНИЕ)
        / ИНИЦИАЛИЗИРУЕМ (КЛАДЕМ ПЕРЕМЕНУЮ В КОРОБКУ) */
        System.out.println(intvariables);

        int intvariables1 = 200;
        System.out.println(intvariables1);

        int dog = 2000 % 999; // доступные операции + - * / %(модуль)
        System.out.println(dog);

        //        другие целочисленные типы данных
        byte bytevariables = (byte) 127;
        short shortvariables = (short) 5438;
        long longvariables = 37588945L;

        System.out.println(bytevariables);

        double doublevariables = 234.7555555555;
        float floatvariables = (float) 234.75555555;

        System.out.println(doublevariables);
        System.out.println(floatvariables);

        char charvariable = 'a';
        char charvariable2 = 108;
        System.out.println(charvariable2);

        char charvariable3 = (char) (charvariable + 10);
        System.out.println(charvariable3);

        boolean booleanvariable = true; //прпинимает правду или ложь.
        boolean booleanvariable2 = false;
        System.out.println(booleanvariable);

        boolean booleanvariable3 = 5 < 6;
        System.out.println(booleanvariable3);

        boolean booleanvariable4 = 6 > 7;
        System.out.println(booleanvariable4);

        String name = "Alex";
        System.out.println(name);

        String stringVariable1 = "Hello, ";
        String stringvariable2 = new String("World");


        String stringvariable3 = stringVariable1 + stringvariable2;
        System.out.println(stringvariable3);
        System.out.println(stringVariable1 + "java");
        System.out.println("I am " + 30 + "years old");
        System.out.println(stringvariable3.length());
        System.out.println(stringvariable3.charAt(1));

        System.out.println(stringvariable3.charAt(3));

    }
}

