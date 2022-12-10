package org.example.dsfromscratch;

import org.jetbrains.annotations.NotNull;

public class Arrays {
    public static void array1DImplement() {
        // declare array
        // and allocating memory of 10 integers
        int[] arr = new int[10];

        // initializing values
        arr[1] = 10;
        arr[2] = 20;
//        print1DArray(arr);

        int[] arr2 = {1, 2, 3, 4}; // another way to initialize array if previous values are known
        print1DArray(arr2);
    }

    public static void print1DArray(int[] arr) {
        System.out.printf("hashCode of arr: %h\n",arr.hashCode());
        System.out.println("Print array using for i statement: ");

        for(int i = 0; i<arr.length; i++)
            System.out.printf("arr[%d] = %d, ", i, arr[i]);
        System.out.println();

        System.out.println("Foreach: ");
        for (var element: arr) {
            System.out.printf("%d ", element);
        }
        System.out.println();
    }

    public static void array2DImplement() {
        int width = 5, height = 5;
        // Declare and initialize a 2d array
        int[][] arr2d;
        arr2d = new int[width][height];
        arr2d[1][1] = 10;
        arr2d[2][2] = 30;

        array2dPrint(arr2d);
    }

    public static void array2dPrint(int[][] arr2d) {
        for(int r = 0; r < arr2d.length; r++) {
            for(int c = 0; c<arr2d[r].length; c++) {
                System.out.printf("%d, ", arr2d[r][c]);
            }
            System.out.println();
        }
    }
}
