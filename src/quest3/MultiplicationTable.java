public class MultiplicationTable {

    public static void main(String[] args) {

        for(int i=1;i<=9;i++){// Переменные управления цикла из1Траверса к9

            for(int j=1;j<=i;j++){// Переменная управления цикла второго уровня равна максимальному индексу первого уровня

                // Вывод результатов расчета без разрывов строк

                System.out.print(j+"*"+i+"="+i*j+"\t");

            }

            System.out.println();// Заворачивать в наружную петлю

        }

    }

}