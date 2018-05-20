package com.pvasiliev.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] data = {1, -1, 4, 7, 2, 7, -6};
        sort(data);
        System.out.println(Arrays.toString(data));
    }

    public static void sort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[min]) {
                    min = j;
                }
            }
            if (min != i) {
                swap(data, i, min);
            }
        }
    }

    private static void swap(int[] data, int i, int j) {
        int tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }
}
