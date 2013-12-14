/*
    started at: Saturday, 14. December 2013 02:45PM
*/

#include <stdio.h>
#include <stdlib.h>

int gcd(int a,int b)
{
    int temp;
    while (b!=0)
    {
        temp = b;
        b = a % b;
        a = temp; 
    }
    return a;
}


int main(int argc, char const *argv[])
{
    int iterations = 0;
    scanf("%d",&iterations);

    for (int i = 0; i < iterations; ++i)
    {
        int total = 0;
        scanf("%d",&total);

        int *nums = (int *)calloc(total,sizeof(int));
        for (int j = 0; j < total; ++j)
        {
            scanf("%d",&nums[j]);
        }

        int gcd_nums = nums[0];

        for (int k = 1; k < total; ++k)
        {
            gcd_nums = gcd(gcd_nums,nums[k]);
        }

        for (int m = 0; m < total; ++m)
        {
            printf("%d ",nums[m]/gcd_nums);
        }
        printf("\n");
        free(nums);
    }
    
    return 0;
}