package ru.geekbrains.lesson2;

public class MainConstruction {
    public static void main(String[] args) {
        within10and20(-10, 20);
        isPositiveOrNegative(-10);

        boolean checkedIsNegative = isNegative(-10);
        if (checkedIsNegative) {
            System.out.println("Отрицательное число " + checkedIsNegative);
        } else {
            System.out.println("Положительное число " + checkedIsNegative);
        }

        printWordNTimes("привет", 8);
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
        return number < 0;
    }

    public static void printWordNTimes(String word, int times) {
        for (int i = 1; i <= times; i++) {
            System.out.println("[" + i + "]: " + word);
        }

    }
}

