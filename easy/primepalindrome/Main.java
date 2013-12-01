/*

    started at: Sunday, 01. December 2013 12:58PM
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int number = Integer.parseInt(reader.readLine());

        while(number<=1003001){
        
            if (check_palindrome(number) && check_prime(number))
            {
                System.out.println(number);
                break;
            }
            number++;
        }  
    }


    public static boolean check_prime(int number){
        for (int i = 2; i < (int) (Math.sqrt(number)); ++i){
            
            if (number%i == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean check_palindrome(int number){
        int num[] = new int[7];
        int i=-1;

        while (number!=0){   
            i++;
            num[i] = number%10;
            number = number/10;
        }

        for (int j = 0,k=i; j < (i+1)/2; ++j,--k){   
            if (num[k]!=num[j]){   
                return false;
            }
        }
        return true;
    }
}