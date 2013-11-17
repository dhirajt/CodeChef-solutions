/*

    started at: Sunday, 17. November 2013 02:30PM
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String var[] = reader.readLine().split(" ");

        int iterations = Integer.parseInt(var[0]);
        int divisor = Integer.parseInt(var[1]);
        int count=0;

       for (int i=0; i<iterations; i++) {
            if (Integer.parseInt(reader.readLine()) % divisor == 0) {
                count++;
            }
        }  
        System.out.println(count);   
    }
}