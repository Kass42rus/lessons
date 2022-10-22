package quest1;

public class hard {
    public static void main(String[] args) {
//        Пусть цена товара A обычно составляет 1000 руб, и товара B составляет 500 руб.
//                Если клиент покупает товары вместе, то на них действует скидка 10% на всю покупку.
//        Выведите на экран переменную (стоимость суммы A+B со скидкой).
//        Отдельно выведите на экран сумму скидки от этой покупки.

        double a_price = 1000;
        double b_price = 500;
        double c_dis = 0.1;

        double d_discost = (a_price + b_price) * c_dis;
        System.out.println(d_discost);

        double total = (a_price+ b_price) - d_discost;
        System.out.println(total);
    }
}
