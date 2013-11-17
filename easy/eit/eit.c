/*
    started at: Sunday, 17. November 2013 02:30PM
*/

#include <stdio.h>

int main(int argc, char const *argv[])
{
    int iterations;
    int divisor;
    int number;

    int count = 0;
    
    scanf("%d",&iterations);
    scanf("%d",&divisor);

    for (int i = 0; i < iterations; ++i)
    {   
        scanf("%d",&number);
        if (number % divisor==0)
        {
            count++;
        }
    }
    printf("%d\n",count);
    return 0;
}