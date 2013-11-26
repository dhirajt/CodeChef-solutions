/*
    started at: Monday, 25. November 2013 11:12PM
*/

#include <stdio.h>

int main(int argc, char const *argv[])
{
    int iterations = 0;
    scanf("%d",&iterations);

    int input = 0;

    for (int i = 0; i < iterations; ++i)
    {   
        scanf("%d",&input);
        if (input % 2 == 0)
        {
            printf("ALICE\n");
        }
        else
        {
            printf("BOB\n");
        }
    }

    return 0;
}