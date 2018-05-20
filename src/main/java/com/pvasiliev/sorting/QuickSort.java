package com.pvasiliev.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] data = {1, -1, 4, 7, 2, 7, -6};
        sort(data);
        System.out.println(Arrays.toString(data));
    }

    public static void sort(int[] data, int start, int end) {
        if (start < end) {
            int p = partition(data, start, end);
            sort(data, start, p - 1);
            sort(data, p, end);
        }
    }

    public static void sort(int[] data) {
        sort(data, 0, data.length - 1);
    }

    private static int partition(int[] data, int start, int end) {
        int mid = (end + start) / 2;
        int pivot = data[mid];
        int i = start;
        int j = end;
        while (i <= j) {
            while (data[i] < pivot) i++;
            while (data[j] > pivot) j--;
            if (i <= j) {
                swap(data, i, j);
                i++;
                j--;
            }
        }
        return i;
    }

    private static void swap(int[] data, int i, int j) {
        int tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }
}
