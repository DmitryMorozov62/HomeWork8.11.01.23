public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
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
        double percent = 1 / 100D;

        while (total <= 2_459_000) {
            months++;
            total = total + (int) (total * percent);
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
        double natality = 17;
        double mortality = 8;
        int years = 0;

        while (years < 10) {
            years++;
            people = people + (int)(natality - mortality) * people / 1000;
            System.out.println("Год " + years + ", численность населения составляет " + people);
        }
    }
    public static void task4() {
        System.out.println("Task 4");
        //writing kode for task 4
        int total = 0;
        int invest = 15_000;
        double percent = 7 / 100D;
        int months = 0;

        while (total < 12_000_000) {
            months++;
            total = total + (int) (percent * total);
            total = total + invest;
            System.out.println(months + " месяц " + total + " рублей");
        }
    }
    public static void task5() {
        System.out.println("Task 5");
        //writing kode for task 5
        int total = 0;
        int invest = 15_000;
        double percent = 7 / 100D;
        int months = 0;

        while (total < 12_000_000) {
            total = total + (int) (total * percent);
            total = total + invest;
            months++;
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
        double percent = 7 / 100D;
        int months = 0;

        while (months < 108){
            months++;
            total = total + (int)(total * percent);
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

        while (firstFriday <= 31) {
                System.out.println("Сегодня пятница " + firstFriday + "-е число.Необходимо подготовить отчет");
            firstFriday = firstFriday + 7;
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
            years = years + 79;
            if (years > beforeThisYears && years < afterThisYears) {
                System.out.println(years);
            }
        }
    }
}