/*
    started at: Thursday, 21. November 2013 10:24PM
*/

#include <stdio.h>
#include <string.h>

int main(int argc, char const *argv[])
{
    int iterations = 0;
    int holes = 0;

    scanf("%d",&iterations);
    /*
    int ch;
    while( (ch = fgetc(stdin)) != EOF && ch != '\n' );
    */
    char text[100] = "";

    while(iterations--)
    {   holes = 0;
        scanf("%s",text); //fgets(text,100,stdin); don't use fgets codechef hates it!
        for (int i = 0; i<strlen(text); ++i)
        {
            switch(text[i])
            {
                case 65:
                case 68:
                case 79:
                case 80:
                case 81:
                case 82: holes++;
                         break;
                case 66: holes += 2;
            }
        }
        printf("%d\n",holes);
    }
    return 0;
}