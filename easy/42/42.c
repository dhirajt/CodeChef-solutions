 /*
    started at: Tuesday, 12. November 2013 12:32PM
*/

#include <stdio.h>

int main(int argc, char const *argv[])
{   
    int answer=0;

    do
    {   
        scanf("%d",&answer);
        if (answer!=42)
        {
            printf("%d\n",answer); 
        }
    }while(answer!=42);
    
    return 0;
}