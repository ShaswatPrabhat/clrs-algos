package com.clrs.sorting.bubblesort;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {
    static void bubbleSort(ArrayList<Integer> arrayList) {
        int length = arrayList.size();
        for (int i =0;i <length; i++){
            for (int j = 0; j<length-i-1; j++){
                if (arrayList.get(j)>arrayList.get(j+1)){
                    int temp = arrayList.get(j);
                    arrayList.set(j,arrayList.get(j+1));
                    arrayList.set(j+1,temp);
                }

            }
            for (Integer a: arrayList){
                System.out.print(a+"  ");
            }
            System.out.println("\n");
        }

    }
    public static void main(String[] args){
        bubbleSort(new ArrayList<>(Arrays.asList(9,100,0,6,2000,79,8)));
    }
}
