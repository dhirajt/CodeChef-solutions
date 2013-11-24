/*
    started at: Sunday, 24. November 2013 02:26PM
*/

#include <stdio.h>
#include <stdlib.h>



int equals(int* array1,int* array2,int size)
{
    for (int i = 0; i < size; ++i)
    {   
        if (array1[i]!=array2[i])
        {   
            return 0;
        }
    }
    return 1;
}

int main(int argc, char const *argv[])
{
    int numbers = 0;
    scanf("%d",&numbers);

    while(numbers>0)
    {
        int* perm = (int *)calloc(numbers,sizeof(int));
        int* revperm = (int *)calloc(numbers,sizeof(int));
        
        for (int i = 0; i < numbers; ++i)
        {
            scanf("%d",&perm[i]);
            revperm[perm[i]-1] = i+1;

        }


        if (equals(perm,revperm,numbers))
        {
            printf("ambiguous\n");
        }
        else
        {
            printf("not ambiguous\n");
        }
        free(perm);
        free(revperm);
        scanf("%d",&numbers);
    }
    
    return 0;
}