package ru.geekbrains.lesson6;

import ru.geekbrains.lesson6.models.Animal;

public class Cat extends Animal {
    private static int count;           // счетчик количества созданных животных класса Cat (котов)

    public Cat(String name, int swims, int run) {
        this.name = name;
        this.swims = swims;
        this.run = run;
        count++;
    }

    public static int getCount() {
        return count;
    }
}
