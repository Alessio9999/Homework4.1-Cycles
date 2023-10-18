public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
        Task6();
        Task7();
        Task8();
        Task9();
        Task10();
    }


    private static void Task1() {
        System.out.println("\n\nЗадача 1:");
        for(byte i=1; i<=10; i++) System.out.print(i+" ");
    }

    private static void Task2() {
        System.out.println("\n\nЗадача 2:");
        for(byte i=10; i>=1; i--) System.out.print(i+" ");
    }

    private static void Task3() {
        System.out.println("\n\nЗадача 3:");
        for(int i=0; i<=17; i+=2) System.out.print(i+" ");
    }

    private static void Task4() {
        System.out.println("\n\nЗадача 4:");
        for(byte i=10; i>=-10; i--) System.out.print(i+" ");
    }

    private static void Task5() {
        System.out.println("\n\nЗадача 5:");
        for(int i=1904; i<=2096; i+=4) System.out.println(i + " год является високосным");
    }

    private static void Task6() {
        System.out.println("\nЗадача 6:");
        for(int i=7; i<=98; i+=7) System.out.print(i+" ");
    }

    private static void Task7() {
        System.out.println("\n\nЗадача 7:");
        for (int i = 1; i <= 512; i = i * 2) System.out.print(i+" ");
    }

    private static void Task8() {
        System.out.println("\n\nЗадача 8:");
        int salary = 29000;
        int total = 0;
        for (byte i = 0; i < 12; i++) {
            total = total + salary;
            System.out.println("Месяц " + (i + 1) + " , сумма накоплений равна "+ total +" рублей");
        }
    }

    private static void Task9() {
        System.out.println("\nЗадача 9:");
        int salary = 29000;
        float deposit = 0;
        float percent = 0.01f;
        byte months =12;

        for (byte i = 0; i < months; i++) {
            deposit = (float) (deposit * (1 + percent));
            deposit = deposit + salary;
            System.out.println("Месяц " + (i + 1) + " , сумма накоплений равна " + deposit + " рублей");
        }
    }

    private static void Task10() {
        System.out.println("\nЗадача 10:");
        for (byte i = 1; i <= 10; i++) System.out.println(2 + " * " + i + " = " + 2 * i);
    }

}