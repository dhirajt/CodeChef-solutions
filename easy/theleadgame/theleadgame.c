/*
    started at: Sunday, 24. November 2013 10:22PM
*/

#include <stdio.h>
#include <stdlib.h>  // to suppress warning on using abs

int main(int argc, char const *argv[])
{
    int iterations = 0;
    scanf("%d",&iterations);

    int lead1 = 0;
    int lead2 = 0;
    int score1 = 0;
    int score2 = 0;
    int new_lead = 0;
    int temp = 0;

    for (int i = 0; i < iterations; ++i)
    {   
        scanf("%d",&temp);
        score1 += temp;
        scanf("%d",&temp);
        score2 += temp;

        new_lead = score1 - score2;

        if (new_lead<0)
        {
            if (lead2<abs(new_lead))
            {
                lead2 = abs(new_lead);
            }
        }
        else if (new_lead>0)
        {
            if (lead1<abs(new_lead))
            {
                lead1 = abs(new_lead);
            }
        }            
    }

    if (lead1<lead2)
    {
        printf("%d %d\n",2,lead2);
    }
    else
    {
        printf("%d %d\n",1,lead1);
    }

    return 0;
}