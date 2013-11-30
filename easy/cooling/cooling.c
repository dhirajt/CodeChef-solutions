/*
    started at: Tuesday, 26. November 2013 10:54PM
*/

#include <stdio.h>
#include <stdlib.h>

int compare (const void * a, const void * b)
{
  return ( *(int*)a - *(int*)b );
}

int main(int argc, char const *argv[])
{
    int iterations = 0;
    scanf("%d",&iterations);

    int pies = 0;
    int count = 0;

    for (int i = 0; i < iterations; ++i)
    {   
        count = 0;
        scanf("%d",&pies);

        int* weights = (int *) calloc(pies,sizeof(int));
        int* weight_limits = (int *) calloc(pies,sizeof(int));

        for (int j = 0; j < pies; ++j)
        {
            scanf("%d",&weights[j]);
        }
        for (int k = 0; k < pies; ++k)
        {
            scanf("%d",&weight_limits[k]);
        }

        qsort(weights,pies,sizeof(int),compare);
        qsort(weight_limits,pies,sizeof(int),compare);

        for (int t=0; t<pies; ++t) 
        {
            if (weights[count]<=weight_limits[t])
            {
                count++;
            }
        }
        printf("%d\n",count);

    }

    return 0;
}