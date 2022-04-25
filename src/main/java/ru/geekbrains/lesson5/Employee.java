package ru.geekbrains.lesson5;

public class Employee {
    private  String name;
    private  String post;
    private  String email;
    private  String phoneNumber;
    private  int salary;
    private  int age;

    public int getAge() {
        return age;
    }

    public Employee(String name, String post, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void print() {
        System.out.println("Имя: " + name + " | " + " Должность: " + post + " | " + " e-mail: " + email + " | " +
                " Тел.: " + phoneNumber + " | " + " ЗП: " + salary + " | " + " Возраст: " + age);
    }
}
