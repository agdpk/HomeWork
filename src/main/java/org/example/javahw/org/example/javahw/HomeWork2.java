package org.example.javahw.org.example.javahw;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println(within10(5,7));
        positive(8);
        System.out.println(number(-8));
        WordTimes("jfaka", 3);
        System.out.println(year(2000));

    }
    public static boolean within10 (int a, int b) {
        return a + b > 10 && a + b <= 20;
    }

    public static void positive (int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println ("Число отрицательное");
        }
    }

    public static boolean number (int a) {
        return a < 0;
    }

    public static void WordTimes (String words, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(words);

        }
    }

    public static boolean year (int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}

