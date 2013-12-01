/*
    started at: Sunday, 01. December 2013 12:58PM
*/

#include <stdio.h>
#include <math.h>
#include <stdlib.h>

int check_prime(int number)
{
    for (int i = 2; i < (int) (sqrt(number)); ++i)
    {
        if (number%i == 0)
        {
            return 0;
        }
    }
    return 1;
}

int check_palindrome(int number)
{   
    int *num = (int *) calloc(7,sizeof(int));
    int i=-1;

    while (number)
    {   i++;
        num[i] = number%10;
        number = number/10;
    }

    for (int j = 0,k=i; j < (i+1)/2; ++j,--k)
    {   
        if (num[k]!=num[j])
        {   
            return 0;
        }
    }
    return 1;

}

int main(int argc, char const *argv[])
{   
    int number=0;
    scanf("%d",&number);

    while(number<=1003001)
    {
        if (check_palindrome(number) && check_prime(number))
        {
            printf("%d\n",number);
            break;
        }
        number++;
    }  
    return 0;
}