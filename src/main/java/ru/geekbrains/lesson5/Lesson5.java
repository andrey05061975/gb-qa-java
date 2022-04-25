package ru.geekbrains.lesson5;

public class Lesson5 {
    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Test_1", "Test_2_1", "Test_2_1@yandex.ru", "11111", 537000, 45);
        employeeArray[1] = new Employee("Test_2", "Test_2_2", "Test_2_2@yandex.ru", "22222", 112000, 21);
        employeeArray[2] = new Employee("Test_3", "Test_2_3", "Test_2_3@yandex.ru", "33333", 638000, 35);
        employeeArray[3] = new Employee("Test_4", "Test_2_4", "Test_2_4@yandex.ru", "44444", 438000, 40);
        employeeArray[4] = new Employee("Test_5", "Test_2_5", "Test_2_5@yandex.ru", "55555", 338000, 41);

        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].getAge() > 40) {
                employeeArray[i].print();
            }
        }
    }
}
