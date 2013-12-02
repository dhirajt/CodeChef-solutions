/*
    started at: Monday, 02. December 2013 12:41PM
*/

#include <stdio.h>

int main(int argc, char const *argv[])
{
    int iterations = 0;
    scanf("%d",&iterations);

    int item=0;

    for (int i = 0; i < iterations; ++i)
    {
        scanf("%d",&item);

        if (item%2==0)
        {
            printf("%d\n",item);
        }
        else
        {
            printf("%d\n",item-1);
        }
    }
    return 0;
}