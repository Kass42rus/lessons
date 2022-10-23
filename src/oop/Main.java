package oop;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getName() + " " + student.getCourse());
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();


        phone1.setModel("Iphone 5");
        phone1.setNumber("79519571335");
        phone1.setWeight(0.569);

        phone2.setModel("Iphone 6");
        phone2.setNumber("79519571336");
        phone2.setWeight(0.570);

        phone3.setModel("Iphone 10");
        phone3.setNumber("79519575337");
        phone3.setWeight(0.689);

        System.out.println();

        System.out.println(phone1.getModel());
        System.out.println(phone1.getNumber());
        System.out.println(phone1.getWeight());

        System.out.println();

        System.out.println(phone2.getModel());
        System.out.println(phone2.getNumber());
        System.out.println(phone2.getWeight());

        System.out.println();

        System.out.println(phone3.getModel());
        System.out.println(phone3.getNumber());
        System.out.println(phone3.getWeight());

        System.out.println();

        phone1.receiveCall("Лиза");
        System.out.println("Номер телефона:+" + phone1.getNumber());

        phone2.receiveCall("Ира");
        System.out.println("Номер телефона:+" + phone2.getNumber());

        phone3.receiveCall("Наташа");
        System.out.println("Номер телефона:+" + phone3.getNumber());

    }
}

