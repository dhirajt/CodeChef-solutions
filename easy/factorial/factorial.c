/*
    started at: Sunday, 17. November 2013 03:44PM
*/

#include <stdio.h>
#include <math.h>

int main(int argc, char const *argv[])
{
    int iterations;
    int zeros;
    float power;
    int number;

    scanf("%d",&iterations);

    for (int i = 0; i < iterations; ++i)
    {   zeros = 0;
        power = 1.0;
        scanf("%d",&number);

        while(pow(5.0,power)<=number)
        {   
            zeros += number/pow(5.0,power);
            power += 1.0;   
        }
        printf("%d\n",zeros);
    }

    return 0;
}