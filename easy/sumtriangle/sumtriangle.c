/*
    started at: Saturday, 23. November 2013 05:33PM
*/

#include <stdio.h>


int max(int a,int b)
{
    return (a>b) ? a : b;
}

int main(int argc, char const *argv[])
{
    int triangle[100][100] = {{0}};
    int iterations = 0;
    int lines = 0;

    scanf("%d",&iterations);
    for (int it = 0; it < iterations; ++it)
    {
        scanf("%d",&lines);
        for (int i = 0; i < lines; ++i)
        {
            for (int j = 0; j <= i; ++j)
            {
                scanf("%d",&triangle[i][j]);
            }
        }

        //------------------------------

        int row = lines - 2;
        int col = 0;

        while(row>=0)
        {   col = 0;
            while(col<=row)
            {
                triangle[row][col] += max(triangle[row+1][col],triangle[row+1][col+1]);
                col++;
            }
            row--;
        }
        printf("%d\n",triangle[0][0]);
        
    }
    return 0;
}