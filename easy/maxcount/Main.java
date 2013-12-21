/*

    started at: Saturday, 14. December 2013 11:21PM
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int iterations = Integer.parseInt(reader.readLine());
        int max = 0;

        for (int i=0; i<iterations; ++i) {
            max = 0;
            int size = Integer.parseInt(reader.readLine());
            int count[] = new int[10001];
            String nums[] = reader.readLine().split(" ");
            for (int j=0; j<size; ++j) {
                int num = Integer.parseInt(nums[j]);
                count[num] += 1;
                if (count[num]>max) {
                    max = count[num];
                }
            }
            for (int k=0; k<10001; ++k) {
                if (count[k]==max) {
                    System.out.println(k+" "+max);
                    break;
                }
            }
        }
    }
}