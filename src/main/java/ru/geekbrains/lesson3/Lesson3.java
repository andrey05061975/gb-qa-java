package ru.geekbrains.lesson3;

public class Lesson3 {
    public static void main(String[] args) {
        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}; // Array for task 3

        System.out.println("\n");
        invertBoolean(array1);

        System.out.println("\n");
        fillValues(20);

        System.out.println("\n");
        multiplyNumbersLessThan6(array3);

        System.out.println("\n");
        fillDiagonalOfMatrix();

        System.out.println("\n");
        fillArrayDefaultValue(5, 1);
    }

    public static void invertBoolean(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
    }

    // Заполнить массив значениями 1 2 … size;
    public static void fillValues(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }

    public static void multiplyNumbersLessThan6(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
    }

    public static void fillDiagonalOfMatrix() {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }

                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void fillArrayDefaultValue(int len, int initialValue){
        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i] + " ");
        }
    }
}
