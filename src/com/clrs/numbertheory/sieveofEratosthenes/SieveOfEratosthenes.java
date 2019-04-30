package com.clrs.numbertheory.sieveofEratosthenes;

import java.util.ArrayList;

public class SieveOfEratosthenes {
    private static ArrayList<Long> sieveOfEratosthenes(long limit){
        ArrayList<Long> primeList = new ArrayList<>();
        for(Long i=2L; i<=limit; i++){
            primeList.add(i);
        }


        for(Long i=2L;i<=limit;i++){
            if(primeList.contains(i)){

                for (long j=2;j*i <= limit; j++)primeList.remove(i*j);
            }
        }
        for (Object a:primeList){
            System.out.println(a);
        }
        return primeList;
    }

    public static void main(String[] args) {
        sieveOfEratosthenes(10000L);
    }
}
