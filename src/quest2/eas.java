package quest2;

import java.util.Scanner;

//Передать на вход программы число от 1 до 7 в качестве аргумента.
//        Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и так далее. Если 6 или 7 – “Выходной”.
//        Используем конструкцию if-else-if.

public class eas {
    public static void main(String[] args) {
        System.out.println("Введите опредленное число");
        System.out.println("Если число 1 = понедельник");
        System.out.println("Если число 2 = вторник");
        System.out.println("Если число 3 = среда");
        System.out.println("Если число 4 = четверг");
        System.out.println("Если число 5 = пятница");
        System.out.println("Если число 6 = суббота");
        System.out.println("Если число 7 = воскресенье");

        Scanner days = new Scanner(System.in);

        System.out.print("Введите число дня недели");
        int n = days.nextInt();

        if (n == 1) {
            System.out.println("понедельник");
        } else if (n == 2) {
            System.out.println("вторник");
        } else if (n == 3) {
            System.out.println("среда");
        } else if (n == 4) {
            System.out.println("четверг");
        } else if (n == 5) {
            System.out.println("пятница");
        } else if (n == 6) {
            System.out.println("суббота");
        } else if (n == 7) {
            System.out.println("воскресенье");
        } else {
            System.out.println("такого дня недели не существует");
        }
    }
}
