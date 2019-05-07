package com.clrs.sorting.quicksort;

import java.util.ArrayList;

public class quickSort {
    ArrayList<Integer> array = new ArrayList<>();

    public ArrayList<Integer> getArray() {
        return array;
    }

    public void setArray(ArrayList<Integer> array) {
        this.array = array;
    }

    private void quicksort(int p, int q){
        if (p<q){
            int r = partition(p,q);
            quicksort(p,r-1);
            quicksort(r+1,q);
        }
    }

    private int partition(int p, int r){
        int x = array.get(r);
        System.out.println(x);
        int i = p-1;
        for (int j = p; j<r; j++){
            if (array.get(j)<=x){
                i = i+1;
                int temp = array.get(j);
                array.set(j,array.get(i));
                array.set(i, temp);
            }
        }
        for(Integer a :array)
            System.out.print(a+" ");
        System.out.println();
        int temp = array.get(i+1);
        array.set(i+1,array.get(r));
        array.set(r,temp);
        return i+1;
    }
    private void randomSort(int p, int q){
        int rand =(int) ((Math.random()*(q-p+1))+p);
        System.out.println(rand);
        int temp = array.get(rand);
        array.set(rand,array.get(q));
        array.set(q, temp);
        this.quicksort(p, q);
    }

    public static void main(String[] args) {
        quickSort ob = new quickSort();
        ob.setArray(new ArrayList<>(){{add(12); add(13); add(9); add(23); add(90); add(72); add(2); }});
        ob.randomSort(0,ob.getArray().size()-1);
        for(Integer a:ob.getArray()){
            System.out.print(a+" ");
        }
        System.out.println();
    }
}
