package com.clrs.sorting.mergesort;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class mergeSort {
    private ArrayList<Integer> array;

    public mergeSort(ArrayList<Integer> array) {
        this.array = array;
    }

    public ArrayList<Integer> getArray() {
        return array;
    }

    public void Sort(){
        Sort(0,array.size());
    }

    private void Sort(int beg, int end){
        System.out.println("Beginning "+ beg+ " End "+end);
        int mid = (beg+end)/2;

        if (beg < end) {
            Sort(beg, mid);
            Sort(mid + 1, end);
            merge(beg, mid, end);
        }
    }

    private void merge(int beg,int mid, int end){
        ArrayList<Integer> tempL = new ArrayList<>(array.subList(beg, mid+1));
        ArrayList<Integer> tempR = new ArrayList<>(array.subList(mid, end));
        int i = 0;
        int j = 0;
        int k = beg;
        while(i<mid - beg+1 && j<end -mid){
            if(tempL.get(i)<=tempR.get(j)){
                array.set(k,tempL.get(i));
                i++;
            }
            else{
                array.set(k,tempR.get(j));
                j++;
            }
            k++;
        }
        while (i<mid-beg+1){
            array.set(k++,tempL.get(i++));
        }
        while(j<end - mid-1){
            array.set(k++, tempR.get(j++));
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(){{
            add(12);
            add(11);
            add(13);
            add(5);
            add(6);
            add(99);
        }};

        mergeSort ob = new mergeSort(list);
        ob.Sort();
        for (Integer a: ob.getArray())
            System.out.print( a+" ");

    }
}
