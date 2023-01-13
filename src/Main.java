public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Task 1");
        //writing kode for task 1
        int months = 0;
        int total= 0;
        int invest = 15_000;
        double percent = invest * 0.01;

        while (total <= 2_459_000) {
            months++;
            invest = invest + (int)percent;
            total = total + invest;
            System.out.println("Месяц " + months + ", сумма накоплений равна " + total + " рублей.");
        }
    }
    public static void task2() {
        System.out.println("Task 2");
        //writing kode for task2
        int a = 0;

        while (a < 10) {
            a++;
            System.out.print(a + " ");
        }
        System.out.println();

        for (a = 10; a > 0; a--) {
            System.out.print(a + " ");
        }
        System.out.println(" ");
    }
    public static void task3() {
        System.out.println("Task 3");
        //writing kode for task 3
        int people = 12_000_000;
        double natality = people / 1000 * 17;
        double mortality = people / 1000 * 8;
        int years = 0;

        while (years < 10) {
            years++;
            people = people + (int)(natality - mortality);
            System.out.println("Год " + years + ", численность населения составляет " + people);
        }
    }
    public static void task4() {
        System.out.println("Task 4");
        //writing kode for task 4
        int total = 0;
        int invest = 15_000;
        double percent = invest * 0.07;
        int months = 0;

        while (total < 12_000_000) {
            months++;
            invest = invest + (int) percent;
            total = total + invest;
            System.out.println(months + " месяц " + total + " рублей");
        }
    }
    public static void task5() {
        System.out.println("Task 5");
        //writing kode for task 5
        int total = 0;
        int invest = 15_000;
        double percent = invest * 0.07;
        int months = 0;

        while (total < 12_000_000) {
            months++;
            invest = invest + (int) percent;
            total = total + invest;
            if (months % 6 == 0) {
            System.out.println(months + " месяц " + total + " рублей");
            }
        }
    }
    public static void task6() {
        System.out.println("Task 6");
        //writing kode for task 6
        int total = 0;
        int invest = 15_000;
        double percent = invest * 0.07;
        int months = 0;

        while (months < 108){
            months++;
            invest = invest + (int)percent;
            total = total + invest;
        if (months % 6 == 0) {
            System.out.println(months + " месяц " + total + " рублей");
            }
        }
    }
    public static void task7(){
        System.out.println("Task 7");
        //writing kode for task 7
        int firstFriday = 3;
        int date = 0;

        while (date <= 31) {
            date++;
            if (date == firstFriday || date == firstFriday + 7 || date == firstFriday + 14 ||
                    date == firstFriday + 21 || date == firstFriday + 28) {
                System.out.println("Сегодня пятница " + date + "-е число.Необходимо подготовить отчет");
            }
        }

    }
    public static void task8() {
        System.out.println("Task 8 ");
        //writing kode for task 8
        int years = 0;
        int thisYears = 2023;
        int beforeThisYears = thisYears - 200;
        int afterThisYears = thisYears + 100;

        while (years < afterThisYears) {
            years++;
            if (years % 79 == 0 && years > beforeThisYears && years < afterThisYears) {
                System.out.println(years);
            }
        }
    }
}