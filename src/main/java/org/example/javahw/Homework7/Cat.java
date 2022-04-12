package org.example.javahw.Homework7;

public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;
    }

    public void eat(Bowl bowl) {
        bowl.decreaseFood(appetite);
        fullness = true;
        System.out.printf("Cat %s has eaten %d food\n", name, appetite);
    }

    public boolean getFullness() {
        return fullness;
    }

    public int getAppetite() {
        return appetite;
    }
}
