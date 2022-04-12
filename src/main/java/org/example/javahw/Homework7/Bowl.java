package org.example.javahw.Homework7;

public class Bowl {
    private int foodAmount;

    public void putFood(int amount) {
        this.foodAmount += amount;
        System.out.printf("Food increased by %d , there is %d now\n", amount, foodAmount);
    }

    public void decreaseFood(int amount) {
        this.foodAmount -= amount;
    }

    public int getFoodAmount() {
        return foodAmount;
    }
}
