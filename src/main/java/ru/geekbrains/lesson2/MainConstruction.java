package ru.geekbrains.lesson2;

public class MainConstruction {
    public static void main(String[] args) {
        MainConstruction.within10and20(-10, 20);
        MainConstruction.isPositiveOrNegative(-10);
        boolean result1 = MainConstruction.isNegative(10);
        System.out.println("Результат проверки: " + result1);
        MainConstruction.printWordNTimes("привет", 8);
    }


    public static void within10and20(int x1, int x2) {
        int sum = x1 + x2;

        if (sum >= 10 && sum <= 20) {
            System.out.println("Сумма " + sum + " лежит от 10 до 20");
        } else {
            System.out.println("Сумма (" + sum + ") лежит не внутри 10 до 20");
        }
    }

    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отприцательное");
        }
    }

    public static boolean isNegative(int number) {
        if (number >= 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void printWordNTimes(String word, int times) {
        for (int i = 1; i <= times; i++) {
            System.out.println("[" + i + "]: " + word);
        }
    }
}


