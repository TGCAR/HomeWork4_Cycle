public class Main {
    public static void main(String[] args) {

        // Task 1

        System.out.println();
        System.out.println("Задача №1");
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }

        // Task 2

        System.out.println();
        System.out.println("Задача №2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        // Task 3

        System.out.println();
        System.out.println("Задача №3");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }

        // Task 4

        System.out.println();
        System.out.println("Задача №4");
        for (int i = 10; i > -11; i--) {
            System.out.println(i);
        }

        // Task 5

        System.out.println();
        System.out.println("Задача №5");
        for (int i = 1904; i < 2097; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

        // Task 6

        System.out.println();
        System.out.println("Задача №6");
        for (int i = 7; i < 99; i = i + 7) {
            System.out.println(i);
        }

        // Task 7

        System.out.println();
        System.out.println("Задача №7");
        for (int i = 1; i < 513; i = i * 2) {
            System.out.println(i);
        }

        // Task 8

        System.out.println();
        System.out.println("Задача №8");
        int sum = 0;
        for (int mounth = 1; mounth <= 12; mounth++) {
            int deposit = 29000;
            sum = sum + deposit;
            System.out.println("Месяц " + mounth + " сумма накоплений составит " +
                    sum);
        }

        // Task 9

        System.out.println();
        System.out.println("Задача №9");
        int sum1 = 0;
        for (int mounth = 1; mounth <= 12; mounth++) {
            int deposit = 29000;
            sum1 = (sum1 + deposit);
            sum1 = (sum1 + sum1 / 100);
            System.out.println("Месяц " + mounth + " сумма накоплений равна " +
                    sum1 + " рублей");
        }

        // Task 10

        System.out.println();
        System.out.println("Задача №10");
        int a = 2;
        for (int i = 1; i <= 10; i++) {
            sum1 = a * i;
            System.out.println(a + "*" + i + "=" + sum1);
        }
    }
}