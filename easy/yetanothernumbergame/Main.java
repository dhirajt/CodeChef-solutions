/*

    started at: Monday, 25. November 2013 11:12PM
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int iterations = Integer.parseInt(reader.readLine());

        for (int i=0; i<iterations; ++i) {
            if (Integer.parseInt(reader.readLine()) % 2 == 0) {
                System.out.println("ALICE");
            }
            else {
                System.out.println("BOB");
            }
        }    
    }
}