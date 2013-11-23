/*

    started at: Saturday, 23. November 2013 05:33PM
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int iterations = Integer.parseInt(reader.readLine());
        int lines = 0;

        for (int it=0; it<iterations; it++) {
            lines = Integer.parseInt(reader.readLine());

            int triangle[][] = new int[lines][lines];

            for (int i = 0; i < lines; ++i){
                String temp[] = reader.readLine().split(" ");
                
                for (int j = 0; j < temp.length; ++j){
                    triangle[i][j] = Integer.parseInt(temp[j]); 

                }
            }
            //--------------------------------------

            int row = lines - 2;
            int col = 0;

            while(row>=0){
                col = 0;
                while(col<=row){
                    triangle[row][col] += max(triangle[row+1][col],triangle[row+1][col+1]);
                    col++;
                }
                row--;
            }
            System.out.println(triangle[0][0]);
        }
        
    }
    public static int max(int a,int b){
        if (a>b) {
            return a;
        }
        return b;
    }
}