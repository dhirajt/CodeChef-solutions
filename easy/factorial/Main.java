/*

    started at: Sunday, 17. November 2013 03:44PM
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int iterations = Integer.parseInt(reader.readLine());

        for (int i=0; i<iterations; i++) {
            int number = Integer.parseInt(reader.readLine());

            int zeros = 0;
            double power = 1.0;
            
            while (Math.pow(5,power)<=number) {
                zeros += number/Math.pow(5.0,power);
                power += 1.0;
            }
            System.out.println(zeros);
        }    
    }
}