package org.example.javahw.Homework7;

import java.util.Scanner;

public class CatsAndBowl {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int addFood;
        Cat[] cats = {
                new Cat ("Barsik", 30),
                new Cat("Pushok", 25),
                new Cat("Murka", 15)
        };

        Bowl bowl = new Bowl();
        System.out.println(bowl.getFoodAmount() + " food in a bowl");

        for (int i = 0; i < cats.length; i++) {
            if (!cats[i].getFullness() && bowl.getFoodAmount() >= cats[i].getAppetite()) {
                cats[i].eat(bowl);
            } else if (!cats[i].getFullness() && bowl.getFoodAmount() < cats[i].getAppetite()){
                System.out.println("Not enough food. How many food would you like to add?");
                addFood = sc.nextInt();
                bowl.putFood(addFood);
                cats[i].eat(bowl);
            }
            System.out.println(bowl.getFoodAmount() + " food in the bowl");
        }

        System.out.println("All cats are fed");
    }
}

