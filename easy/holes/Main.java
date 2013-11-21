/*

    started at: Thursday, 21. November 2013 10:24PM
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int iterations = Integer.parseInt(reader.readLine());
        int holes = 0;
        String text = "";

        for (int i=iterations; i>0; i--) {
            holes = 0;
            text = reader.readLine();
            for (int pos=0; pos<text.length(); pos++) {
                switch (text.charAt(pos)) {
                    case 65:
                    case 68:
                    case 79:
                    case 80:
                    case 81:
                    case 82: holes++;
                             break;
                    case 66: holes +=2;                    
                }   
            }
            System.out.println(holes);  
        }
    }
}