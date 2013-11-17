/*

    started at: Sunday, 17. November 2013 01:53PM
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String var[] = reader.readLine().split(" ");
        int withdrawl = Integer.parseInt(var[0]);
        float balance = Float.parseFloat(var[1]);

        if (withdrawl%5 == 0 && balance > (withdrawl+0.5)) {
            System.out.println(balance - (withdrawl+0.5));                     
        }
        else {
            System.out.println(balance);         
        }     
    }
}