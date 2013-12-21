/*

    started at: Saturday, 21. December 2013 05:39PM
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int iterations = Integer.parseInt(reader.readLine());

        for (int i=0; i<iterations; ++i) {
            System.out.println(Integer.parseInt(reader.readLine())/2+1);
        } 
    }
}