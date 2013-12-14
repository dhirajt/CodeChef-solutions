/*

    started at: Saturday, 14. December 2013 02:45PM
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int iterations = Integer.parseInt(reader.readLine());

        for (int i=0; i<iterations; ++i) {

            String nums[] = reader.readLine().split(" ");
            int size = Integer.parseInt(nums[0]);
            int numb[] = new int[size];

            numb[0] = Integer.parseInt(nums[1]);

            int gcd_nums = numb[0];

            for (int j=2; j<=size; ++j) {
                numb[j-1] = Integer.parseInt(nums[j]);
                gcd_nums = gcd(gcd_nums,numb[j-1]);
            }

            for (int k=0; k<size; ++k) {
                System.out.print((numb[k]/gcd_nums)+" ");
            }
            System.out.println();
        }
    }

    public static int gcd(int a,int b) {
        int temp;
        while (b!=0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}