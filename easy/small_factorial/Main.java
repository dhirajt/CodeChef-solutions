/*

    started at: Sunday, 17. November 2013 11:36PM
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.math.BigInteger;

public class Main{
    
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int iterations = Integer.parseInt(reader.readLine());

        for (int i=0; i<iterations; i++) {
            BigInteger num = new BigInteger(reader.readLine());
            System.out.println(factorial(num));      
        }  
    }

    public static BigInteger factorial(BigInteger number){
        BigInteger a = new BigInteger("1");
        if (number.compareTo(a)==0) {
            return a;
        }
        else {
            return number.multiply(factorial(number.subtract(a)));
        }
    }
}