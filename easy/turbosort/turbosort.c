/*
    started at: Saturday, 23. November 2013 12:16AM
*/

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int compare (const void * a, const void * b)
{
  return ( *(int*)a - *(int*)b );
}

int main(int argc, char const *argv[])
{
    int arraysize = 0;
    scanf("%d",&arraysize);
    
    int* array = (int *) calloc(arraysize,sizeof(int));

    for (int i = 0; i < arraysize; ++i)
    {
        scanf("%d",&array[i]);
    }
    qsort(array,arraysize,sizeof(int),compare);    
    for (int i = 0; i < arraysize; ++i)
    {
        printf("%d\n",array[i]);
    }
    free(array);
    return 0;
}
