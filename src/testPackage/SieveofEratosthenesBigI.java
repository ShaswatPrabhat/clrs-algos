package testPackage;

import org.jetbrains.annotations.Contract;

import java.math.BigInteger;
import java.util.ArrayList;

public class SieveofEratosthenesBigI {
    private BigInteger bgILimit;
    private ArrayList<BigInteger> res;

    public SieveofEratosthenesBigI(BigInteger bgILimit) {
        this.bgILimit = bgILimit;
    }

    public ArrayList<BigInteger> generatePrimeList(){
        res = new ArrayList<>();

        for(BigInteger i = BigInteger.valueOf(2);
            i.compareTo(this.bgILimit)<=0;)
        {
//            System.out.println(i);
            if (i.compareTo(BigInteger.valueOf(2)) == 0 || i.compareTo(BigInteger.valueOf(3)) == 0) res.add(i);
            else if (i.mod(BigInteger.valueOf(6)).compareTo(BigInteger.valueOf(1)) == 0 && checkMod(i))
                res.add(i);
            else if (i.mod(BigInteger.valueOf(6)).compareTo(BigInteger.valueOf(5)) == 0 && checkMod(i))
                res.add(i);

            i=i.add(BigInteger.valueOf(1));
        }
//        for (int i = 0;
//             i<res.size();
//             i++)
//        {
//            BigInteger elem = res.get(i);
//            for (int j = i+1;j<res.size();j++){
//                if (res.get(j).mod(elem).compareTo(BigInteger.ZERO)==0)
//                    res.remove(res.get(j));
//            }
//        }

        return res;
    }
    private boolean checkMod(BigInteger candidate){
        for(BigInteger elem:res){
            if(candidate.mod(elem).compareTo(BigInteger.ZERO)==0)
                return false;

        }
        return true;
    }

}
