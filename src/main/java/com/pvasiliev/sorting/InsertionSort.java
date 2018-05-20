package com.pvasiliev.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] data = {1, -1, 4, 7, 2, 7, -6};
        sort(data);
        System.out.println(Arrays.toString(data));
    }

    public static void sort(int[] data) {
        for (int i = 1; i < data.length; i++) {
            int j = i - 1;
            int key = data[i];
            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = key;
        }
    }
}
