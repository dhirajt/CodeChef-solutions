/*

    started at: Sunday, 08. December 2013 08:00PM
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int iterations = Integer.parseInt(reader.readLine());

        int total = 0;
        int done = 0;
        for (int i=0; i<iterations; ++i) {
            String inputs[] = reader.readLine().split(" ");
            String chef = "";
            String assistant = "";
            total = Integer.parseInt(inputs[0]);
            done = Integer.parseInt(inputs[1]);

            int tasks[] = new int[total+1];
            inputs = reader.readLine().split(" ");

            for (int j=0; j<done; ++j) {
                tasks[Integer.parseInt(inputs[j])] = -1;
            }

            for (int k=1,t=0; k<total+1; ++k) {
                if(tasks[k]==-1){
                    continue;
                }
                if(t%2==0){
                    chef += Integer.toString(k)+" ";
                }
                else {
                    assistant += Integer.toString(k)+" ";
                }
                ++t;
            }
        System.out.println(chef);
        System.out.println(assistant);
        }    
    }
}