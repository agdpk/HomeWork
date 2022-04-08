package org.example.javahw.Homework6;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(int len) {
        if (len <= 500) {
            System.out.printf("%s run %dm\n", name, len);
        } else {
            System.out.printf("Dog can't run more than 500m\n");
        }
    }

    @Override
    public void swim(int len) {
        if (len <= 10) {
            System.out.printf("%s swim %dm\n", name, len);
        } else {
            System.out.printf("Dog can't swim more than 10m\n");
        }
    }
}
