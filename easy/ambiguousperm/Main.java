/*

    started at: Sunday, 24. November 2013 02:26PM
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Arrays;
import java.util.HashMap;

public class Main{
    
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        HashMap <Integer,Integer> hm = new HashMap<Integer,Integer>();
        int numbers = Integer.parseInt(reader.readLine());
        
        while (numbers>0) {
            int perm[] = new int[numbers];
            int revperm[] = new int[numbers];

            String charnums[] =  reader.readLine().split(" ");

            for (int i=0; i<numbers; i++) {
                perm[i] = Integer.parseInt(charnums[i]);
                hm.put(perm[i],i+1);
            }

            for (int j=0; j<numbers; j++) {
                revperm[j] = hm.get(j+1);
            }

            if (Arrays.equals(perm,revperm)) {
                System.out.println("ambiguous");
            }
            else {
                System.out.println("not ambiguous");
            }
            numbers = Integer.parseInt(reader.readLine());
        }

    }
}