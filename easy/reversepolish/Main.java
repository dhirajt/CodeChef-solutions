/*

    started at: Sunday, 24. November 2013 11:45AM
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Stack;

public class Main{
    
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int iterations = Integer.parseInt(reader.readLine());
        
        String line;
        Stack <Character> operators = new Stack<Character>();
        StringBuilder reversepolish = new StringBuilder();;

        for (int i=0; i<iterations; ++i) {
            line = reader.readLine().trim();
            for (char ch : line.toCharArray()) {
                if (ch>=97 && ch<=123) {
                    reversepolish.append(ch);                    
                }
                else if (ch==')') {
                    reversepolish.append(operators.pop());
                }
                else if (ch!='(') {
                    operators.push(ch);
                }
            }
            System.out.println(reversepolish.toString());
            reversepolish.setLength(0);
        }

    }
}