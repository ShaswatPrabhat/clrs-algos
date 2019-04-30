package com.clrs.sorting.insertionsort;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSort {
    private static void insertionSort(@NotNull ArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            int temp = arrayList.get(i);
            int j = i;
            while (j > 0 && temp < arrayList.get(j - 1)) {
                arrayList.set(j, arrayList.get(j - 1));
                j = j - 1;
            }
            arrayList.set(j, temp);
            for (Integer a : arrayList)
                System.out.print(a + "   ");
            System.out.println();
        }

    }

    public static void main(String[] args) {
        insertionSort(new ArrayList<>(Arrays.asList(9, 0, 99, 23, 25, 26)));
    }
}
