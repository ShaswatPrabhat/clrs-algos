package testPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class newSwitch {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inp = br.readLine();
        int result;
        switch(inp){
            case "MONDAY":
                System.out.println(1);
                break;
            case "Tuesday":
                System.out.println(2);
                break;

        }
    }
}
