package org.example.javahw.org.example.javahw;

import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(invertValues(new int[]{1, 0, 1, 1, 0, 0})));
        createArray();
        changeArray();
        diagonals();
        System.out.println(Arrays.toString(createArrWithValues(5,16)));
        maxAndMinValues(new int[]{7, 8, 5, 10, 9});
        System.out.println(checkPartsSum());
        shiftArr(-2);
    }


    public static int[] invertValues(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        return arr;
    }

    public static void createArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 6;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void diagonals() {
        int[][] arr = new int[7][7];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j || i + j == arr.length - 1) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

    }

    public static int[] createArrWithValues(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    public static void maxAndMinValues(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.printf("Минимальное значение: %s\nМаксимальное значение: %d\n", min, max);
    }

    public static boolean checkPartsSum() {
        int[] arr = {1, 1, 1, 2, 1};
        int leftPart = 0;
        int rightPart = 0;

        for (int i = 0; i < arr.length; i++) {
            leftPart += arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            rightPart += arr[i];
            leftPart -= arr[i];
            if (rightPart == leftPart) {
                return true;
            }
        }
        return false;
    }

    public static void shiftArr(int n) {
        int[] arr = {16, 81, 13, 27, 5};

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int temp = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = temp;
            }
        }
        if (n < 0) {
            for (int i = n; i < 0; i++) {
                int temp = arr[0];
                for (int j = 0; j  < arr.length - 1; j++) {
                    arr[j] = arr[j+1];
                }
                arr[arr.length - 1] = temp;}
        }
        System.out.println(Arrays.toString(arr));
    }
}
