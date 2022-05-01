package ru.geekbrains.lesson6.models;

public class Animal {
    protected String name;       // имя или кличка животного (если есть)
    protected int swims;         // возможность животного плавать    (численная характеристика, метры непрерывного интенсивного плавания)
    protected int run;           // возможность животного бегать     (численная характеристика, метры непрерывного быстрого бега)
    private static int count;    // счетчик количества созданных животных


    public Animal() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return ", Кличка: '" + name + "\' \n" +
                ", Может проплыть " + swims + "м. " +
                ", Может пробежать " + run + "м. ";
    }

    public void run(int distance) {
        if (run >= distance) {
            System.out.println(this.name + "  - УСПЕШНО пробежал(а) " + distance + "м.");
        } else {
            System.out.println(this.name + " ---- сошел(а) с дистанции ---- ");
        }
    }

    public void swim(int distance) {
        if (swims >= distance) {
            System.out.println(this.name + "   - УСПЕШНО проплыл(а) " + distance + "м.");
        } else {
            System.out.println(this.name + " ---- не выполнил норматив ---- ");
        }
    }
}
