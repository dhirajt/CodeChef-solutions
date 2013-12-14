/*
    started at: Saturday, 14. December 2013 09:14PM
*/

#include <stdio.h>


int find_k(int num,int array[])
{
    for (int i=0; i<12; ++i)
    {
        if (array[i]>num)
        {
            return array[i-1];
        }
    }
    return array[11];
}
int main(int argc, char const *argv[])
{
    int iterations = 0;
    scanf("%d",&iterations);

    int menus[] = {1,2,4,8,16,32,64,128,256,512,1024,2048};

    int count = 0;
    int num = 0;
    int k = 0;

    for (int i=0; i<iterations; ++i)
    {
        count = 0;
        scanf("%d",&num);

        for (int j=0; j<12; ++j) 
        {
            if (menus[j]==num)
            {
                count = 1;        
            }
        }
        if (count!=0)
        {
            printf("%d\n",count);
            continue;
        }
        while (num!=0) 
        {
            k = find_k(num,menus);
            num -= k;
            count++;             
        }
        printf("%d\n",count);
    }

    return 0;
}