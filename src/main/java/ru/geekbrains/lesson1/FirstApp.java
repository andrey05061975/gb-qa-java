package ru.geekbrains.lesson1;

import java.awt.*;

public class FirstApp {
    public static void main(String[] args) {
        FirstApp.printThreeWords();
        FirstApp.checkSumSign();
        FirstApp.printColor();
        FirstApp.compareNumbers();

    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 30;
        int b = 20;
        int c = a + b;

        if (c > 0) {
            System.out.println("сумма положительная");
        } else {
            System.out.println("сумма отрицательная");
        }

        System.out.println("c=" + c);
    }

    public static void printColor() {
        int value = 1;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {
        int a = 20;
        int b = 30;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}