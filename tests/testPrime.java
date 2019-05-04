import org.junit.Test;
import testPackage.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class testPrime {
    checkPrime obj = new checkPrime(1);
    @Test
    public void checkPrimeTest1(){
        obj.setNumber(1);
        boolean result = obj.isPrime();
        assertFalse(result);
    }

    @Test
    public void checkPrimeTest2() {
        obj.setNumber(2);
        assertTrue(obj.isPrime());
    }

    @Test
    public void checkPrime3(){
        obj.setNumber(3);
        assertTrue(obj.isPrime());
    }
    @Test
    public void checkPrime10(){
        obj.setNumber(10);
        assertFalse(obj.isPrime());
    }

}
