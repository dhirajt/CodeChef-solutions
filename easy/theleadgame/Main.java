/*

    started at: Sunday, 24. November 2013 10:22PM
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main{
    
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int iterations = Integer.parseInt(reader.readLine());

        int lead1 = 0;
        int lead2 = 0; 
        int score1 = 0;
        int score2 = 0;
        int new_lead;
        for (int i=0; i<iterations; ++i) {
            String scores[] = reader.readLine().split(" ");

            score1 += Integer.parseInt(scores[0]);
            score2 += Integer.parseInt(scores[1]);

            new_lead = score1 - score2;

            if (new_lead<0){
                if (lead2<Math.abs(new_lead)) {
                    lead2 = Math.abs(new_lead);
                }
            }
            else if (new_lead>0) {
                if (lead1<Math.abs(new_lead)) {
                    lead1 = Math.abs(new_lead);
                }
            }
        }
        
        if (lead1>lead2) {
            System.out.println("1 "+lead1);
        }
        else {
            System.out.println("2 "+lead2);
        }

    }
}