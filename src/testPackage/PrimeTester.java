package testPackage;


import java.math.BigInteger;
import java.util.ArrayList;

public class PrimeTester {
    public static void main(String[] args) {
        SieveofEratosthenesBigI ob = new SieveofEratosthenesBigI(BigInteger.valueOf(1000000));
        ArrayList<BigInteger> res = ob.generatePrimeList();
        for (BigInteger elem:res)
            System.out.println(elem+"  ");
        System.out.println();
    }
}
