/*

    started at: Saturday, 14. December 2013 09:14PM
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int menus[] = {1,2,4,8,16,32,64,128,256,512,1024,2048};

        int iterations = Integer.parseInt(reader.readLine());
        int count = 0;
        int num = 0;
        int k = 0;
        for (int i=0; i<iterations; ++i) {
            count = 0;
            num = Integer.parseInt(reader.readLine());
            for (int j=0; j<12; ++j) {
                if (menus[j]==num) {
                    count = 1;        
                }
            }
            if (count!=0) {
                System.out.println(count);
                continue;
            }
            while (num!=0) {
                k = find_k(num,menus);
                num -= k;
                count++;             
            }
            System.out.println(count);     
        }     
    }

    public static int find_k(int num,int array[]){
        for (int i=0; i<array.length; ++i) {
            if (array[i]>num) {
                return array[i-1];
            }
        }
        return array[11];
    }
}