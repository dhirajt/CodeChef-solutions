/*

    started at: Saturday, 14. December 2013 04:08PM
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nums[] = reader.readLine().split(" ");
        int num = Integer.parseInt(nums[0])-Integer.parseInt(nums[1]);

        if (num%10==9) {
            num -= 1;       
        }
        else{
            num += 1;
        }
        System.out.println(num);
    }
}