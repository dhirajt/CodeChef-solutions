/*

    started at: Saturday, 23. November 2013 12:16AM
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import java.util.Arrays;

public class Main{
    
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer=new PrintWriter(new OutputStreamWriter(System.out));
        
        int iterations = Integer.parseInt(reader.readLine());
        int array[] = new int[iterations];

        for (int i=0; i<iterations; ++i) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(array);

        for (int i=0; i<iterations; ++i) {
            writer.println(array[i]);       
        }   
        writer.flush();
        writer.close();
    }
}