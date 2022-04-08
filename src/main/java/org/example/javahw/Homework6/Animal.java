package org.example.javahw.Homework6;

public abstract class Animal {
    protected String name;

    public Animal() {
        System.out.println("Animal born");
    }

    public Animal(String name) {
        this();
        this.name = name;
    }

    public void run(int len) {
        System.out.printf("%s run $dm\n", name, len);
    }

    public void swim(int len) {
        System.out.printf("%s swim %dm\n", name, len);
    }

}