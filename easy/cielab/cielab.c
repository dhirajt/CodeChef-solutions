/*
    started at: Saturday, 14. December 2013 04:08PM
*/

#include <stdio.h>

int main(int argc, char const *argv[])
{
    int num1 = 0;
    int num2 = 0;
    int num;
    scanf("%d",&num1);
    scanf("%d",&num2);
    num = num1-num2;
    printf("%d\n",num%10==9 ? num-1 : num+1);
    return 0;
}