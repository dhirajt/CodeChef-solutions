/*
    started at: Sunday, 17. November 2013 11:36PM
*/

// NOT WORKING YET!

#include <stdio.h>

int factorial(int number)
{
    int fact = 1;
    while (number)
    {
        fact *= number;
        number--;
    }

    return fact;
}

int main(int argc, char const *argv[])
{
    int iterations;
    int number;

    scanf("%d",&iterations);

    for (int i = 0; i < iterations; ++i)
    {   
        scanf("%d",&number);
        printf("%d\n",factorial(number)); 
    }
    return 0;
}
