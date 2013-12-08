/*
    started at: Sunday, 08. December 2013 08:00PM
*/

#include <stdio.h>
#include <stdlib.h>

void flushbuf()
{
    char ch;
    while ((ch = getchar()) != '\n' && ch != EOF)
    continue;
}

int main(int argc, char const *argv[])
{
    int iterations = 0;
    scanf("%d",&iterations);

    int ntotal = 0;
    int ndone = 0;

    for (int i = 0; i < iterations; ++i)
    {
        scanf("%d %d",&ntotal,&ndone);
        flushbuf();
        int* chef = (int *) calloc(ntotal+1,sizeof(int));
        int* assistant = (int *) calloc(ntotal+1,sizeof(int));
        int done = 0;

        for (int j = 1; j <= ndone; ++j)
        {   
            scanf("%d",&done);
            chef[done] = -1;
            assistant[done] = -1;
        }
        for (int k = 1,m=0; k <= ntotal; ++k)
        {   
            if (chef[k]==-1)
            {
                continue;
            }
            if (m%2==0)
            {
                chef[k] = 1;
            }
            else
            {
                assistant[k] = 1;
            }
            m++;
        }
        
        for (int l = 1; l <= ntotal; ++l)
        {
            if (chef[l]>0)
            {
                printf("%d ",l);
            }
        }
        printf("\n");
        for (int m = 1; m <= ntotal; ++m)
        {
            if (assistant[m]>0)
            {
                printf("%d ",m);
            }
        }
        printf("\n");
        free(chef);
        free(assistant);
    }
    return 0;
}