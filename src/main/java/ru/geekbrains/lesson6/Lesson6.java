package ru.geekbrains.lesson6;

import ru.geekbrains.lesson6.models.Animal;

public class Lesson6 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Cat("Мурзик", 0, 200);
        animals[1] = new Cat( "Алиса", 0, 200);
        animals[2] = new Dog( "Наг", 10, 500);
        animals[3] = new Dog( "Лора", 10, 500);

        System.out.println("Характеристики созданных животных");
        System.out.println("---------------------------------------------------------------------------------------");
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }
        System.out.println("---------------------------------------------------------------------------------------");


        System.out.println("Всего котов создано: " + (Cat.getCount()));
        System.out.println("Всего животных создано: " + Animal.getCount());
        for (int i = 0; i < animals.length; i++) {
            animals[i].run(500);
        }
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Плавание: ");
        System.out.println("---------------------------------------------------------------------------------------");

        for (int i = 0; i < animals.length; i++) {
            animals[i].swim(10);
        }
    }
}
