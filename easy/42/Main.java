/*

    started at: Thursday, 14. November 2013 10:07PM
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main{
    
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num;
        do {   
            num = Integer.parseInt(reader.readLine());
            if (num != 42) {
                System.out.println(num);
            }
        }while (num!=42);       
    }
}