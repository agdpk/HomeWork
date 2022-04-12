package org.example.javahw.Homework6;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int len) {
        if (len <= 200) {
            System.out.printf("%s run %dm\n", name, len);
        } else {
            System.out.printf("%s can't run more than 200m\n", name);
        }
    }

    @Override
    public void swim(int len) {
        System.out.printf("%s can't swim\n", name);
    }
}