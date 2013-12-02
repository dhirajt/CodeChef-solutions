/*

    started at: Monday, 02. December 2013 12:41PM
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int iterations = Integer.parseInt(reader.readLine());
        int item = 0;

        for (int i=0; i<iterations; i++) {
            item = Integer.parseInt(reader.readLine());

            if (item%2==0) {
                System.out.println(item);
            }
            else {
                System.out.println(item-1);
            }
        }   
    }
}