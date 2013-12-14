/*
    started at: Saturday, 14. December 2013 05:33PM
*/

#include <stdio.h>
#include <stdlib.h>

int min(int a,int b)
{
    return a>b ? b : a;
}

int getarraymin(int arr[])
{   
    int min = arr[0];
    for (int i = 0; i < 10; ++i)
    {
        if (arr[i]<min)
        {
            min = arr[i];
        }
    }
    return min;
}

int multiply(char ch,int times)
{   
    int num = 0;
    char *str = (char *)calloc(times+1,sizeof(char));
    if (ch=='0')
    {
        times += 1;
    }
    for (int i = 0; i < times; ++i)
    {
        str[i] = ch;
    }
    if (ch=='0')
    {
        str[0] = '1';
    }
    sscanf(str,"%d",&num);
    free(str);
    return num;
}

int main(int argc, char const *argv[])
{   
    
    int iterations = 0;
    scanf("%d",&iterations);

    int candles[10] = {0};
    int result = 1000000000;
    int array_min = 0;

    for (int i = 0; i < iterations; ++i)
    {   
        result = 1000000000;
        for (int j = 0; j < 10; ++j)
        {
            scanf("%d",&candles[j]);
        }
        array_min = getarraymin(candles); 
        
        for (int k = 0; k < 10; ++k)
        {
            if (candles[k]==array_min)
            {
                if (k==0)
                {
                    result = min(result,multiply('0',array_min+1));
                }
                else
                {
                    result = min(result,multiply((char)(((int)'0')+k),array_min+1));
                }
            }
        }
        printf("%d\n",result);
    }
    return 0;
}