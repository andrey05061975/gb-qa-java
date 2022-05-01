package ru.geekbrains.lesson6;

import ru.geekbrains.lesson6.models.Animal;

public class Dog extends Animal {
    private static int count;           // счетчик количества созданных животных класса Dog (собак)

    public Dog(String name, int swims, int run) {
        this.name = name;
        this.swims = swims;
        this.run = run;
        count++;
    }

    public static int getCount() {
        return count;
    }
}
