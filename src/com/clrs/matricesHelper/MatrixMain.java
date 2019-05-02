package com.clrs.matricesHelper;

public class MatrixMain {
    public static void main(String[] args) throws Exception {
        Matrices m = new Matrices("2 2 2\n3 3 3\n4 4 4\n");

        System.out.println(m);


        try {
            System.out.println(m.exponentiation(10));
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
