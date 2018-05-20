package com.pvasiliev.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] data = {1, -1, 4, 7, 2, 7, -6};
        sort(data);
        System.out.println(Arrays.toString(data));
    }

    public static void sort(int[] data) {
        sort(data, 0, data.length - 1);
    }

    public static void sort(int[] data, int start, int end) {
        if (end - start < 1) return;
        sort(data, start, (end + start) / 2);
        sort(data, (end + start) / 2 + 1, end);
        merge(data, start, end);
    }

    private static void merge(int[] data, int start, int end) {
        int mid = (end + start) / 2;
        int i = start;
        int j = mid + 1;
        int k = 0;
        int[] tmp = new int[end - start + 1];
        while (i <= mid && j <= end) {
            if (data[i] < data[j]) {
                tmp[k] = data[i];
                i++;
            } else {
                tmp[k] = data[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            tmp[k] = data[i];
            k++;
            i++;
        }
        while (j <= end) {
            tmp[k] = data[j];
            k++;
            j++;
        }
        System.arraycopy(tmp, 0, data, start, tmp.length);
    }
}
