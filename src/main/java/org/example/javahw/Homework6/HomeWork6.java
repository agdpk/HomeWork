package org.example.javahw.Homework6;

public class HomeWork6 {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Barsik"),
                new Dog("Bobik"),
                new Cat("Murka"),
                new Cat("Tobi"),
                new Dog("Jack"),
        };

        int catsAmount = 0;
        int dogsAmount = 0;


        for (int i = 0; i < animals.length; i++) {
            animals[i].run(250);
            animals[i].swim(10);


            if (animals[i] instanceof Cat) {
                catsAmount++;
            }

            if (animals[i] instanceof Dog) {
                dogsAmount++;
            }
        }
        System.out.printf("%d cats\n", catsAmount);
        System.out.printf("%d dogs\n", dogsAmount);
    }
}
