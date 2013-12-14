/*

    started at: Saturday, 14. December 2013 05:33PM
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int iterations = Integer.parseInt(reader.readLine());

        int candles[] = new int[10];
        int min = 0;
        int index = 0;
        int temp = 0;
        int result = 1000000000;

        for (int i=0; i<iterations; ++i) {
            result = 1000000000;
            String scandles[] = reader.readLine().split(" ");

            for (int j=0; j<10; ++j) {
                candles[j] = Integer.parseInt(scandles[j]);
            }

            min = getMin(candles);
            
            for (int k=0; k<10; ++k) {
                if (candles[k]==min) {
                    if (k==0) {
                        result = Math.min(result,Integer.parseInt("1"+multiply("0",min+1)));
                    }
                    else{
                        result = Math.min(result,Integer.parseInt(multiply(Integer.toString(k),min+1)));
                    }
                }
            }
            System.out.println(result);

        }     
    }

    public static int getMin(int array[]){
        int min = array[0];
        for (int i=0; i<array.length; ++i) {
            if (array[i]<min) {
                min = array[i];
            }
        }
        return min;
    }
    public static String multiply(String str, int count){ 
        StringBuilder sb = new StringBuilder(); 
        for( int i = 0; i < count; ++i ){ 
            sb.append(str); 
        } 
        return sb.toString(); 
    }
}