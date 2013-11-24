/*
    started at: Sunday, 24. November 2013 11:45AM
*/

#include <stdio.h>
#include <string.h>

// This is giving SIGSEV error on codechef but runs correctly
// on my machine.Will return to it later.

int main(int argc, char const *argv[])
{
    int iterations = 0;
    scanf("%d",&iterations);

    char line[401] = "\0";
    char operators[401] = "\0";
    char reversepolish[401] = "\0";

    int top = 0;
    int revtop = 0;
    for (int i = 0; i < iterations; ++i)
    {
        scanf("%s",line);
        for (int k = 0; line[k]!='\0'; ++k)
        {
            if (line[k]>=97 && line[k]<=123)
            {
                
                reversepolish[revtop] = line[k];
                revtop++;
                
            }
            else if (line[k]==')')
            {   
                top--;
                reversepolish[revtop] = operators[top];
                revtop++;
            }
            else if (line[k]!='(')
            {   
                operators[top] = line[k];
                top++;
            }
        }
        printf("%s\n",reversepolish);
    }
    return 0;
}