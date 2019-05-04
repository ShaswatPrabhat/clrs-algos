package testPackage;

import org.jetbrains.annotations.Contract;

public class checkPrime {
    private int number;
    @Contract(pure = true)
    public  checkPrime(int number){
        this.number = number;
    }
    public boolean isPrime(){
        if(number == 1)
        return false;
        else
        {
            if (number ==2)
                return true;
            else
            {
                for(int i = 2;i<=(int)(Math.sqrt(this.number))+1;i++){
                    if (this.number%i ==0)return false;
                            break;
                }
                return true;
            }
        }
    }
    public void setNumber(int number){
        this.number = number;
    }

}
