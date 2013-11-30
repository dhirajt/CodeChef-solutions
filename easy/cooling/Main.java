/*

    started at: Tuesday, 26. November 2013 10:54PM
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Arrays;

public class Main{
    
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int iterations = Integer.parseInt(reader.readLine());
        
        for (int k=0; k<iterations; k++) {
            int pies = Integer.parseInt(reader.readLine());

            String line1[] = reader.readLine().split(" ");
            String line2[] = reader.readLine().split(" ");

            int weights[] = new int[pies];
            int weight_limits[] = new int[pies];

            int count=0;

            for (int i=0; i<pies; ++i) {
                weights[i] = Integer.parseInt(line1[i]);
                weight_limits[i] = Integer.parseInt(line2[i]);         
            }

            Arrays.sort(weights);
            Arrays.sort(weight_limits);

            for (int j=0; j<pies; ++j) {
                if (weights[count]<=weight_limits[j]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}