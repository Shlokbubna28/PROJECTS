// THIS IS A CREDIT CARD VALIDATION SYSTEM program -- To know more please read the description.

#include <cs50.h>
#include <stdio.h>
#include <math.h>

int count(long b)
{
    int c = 0;
    while(b>0)
    {
        c++;
        b=b/(long)10;
    }
    return c;
}
int func(int a)
{
    int sumb=0;
    while(a>0)
    {
        sumb = sumb + (a%10);
        a = a/10;
    }
    return sumb;
}


int main(void)
{
    long cnum = get_long("Number: ");

    long cnum1 = cnum;
    int sum = 0;
    int sum2 = 0;
    int c = 0;
    while(cnum1>0)
    {
        sum = sum + cnum1%10;
        cnum1 = cnum1 / (long)10;

        sum2 = sum2 + func((cnum1%10) * 2);
        cnum1 = cnum1 / (long)10;

    }
    c=count(cnum);
    int finalsum = 0;
    //printf("Sum: %i\n",sum);
    //printf("Sum(*2): %i\n",sum2);
    finalsum = sum+sum2;
    // printf("%i\n",finalsum);
    if((finalsum %10) == 0)
    {
        int av = cnum/(pow(10,(c-2)));
        if((av==51 || av == 52 || av == 55 || av == 53 || av == 54) && (c==16))
        {
            printf("MASTERCARD\n");       //16 digits
        }
        else if((av==34|| av == 37)  && (c==15))
        {
            printf("AMEX\n");      //15 digits
        }
        else if(((av/10) == 4)  && ((c==13|| c==16)))
        {
            printf("VISA\n");   //13,16 digits
        }
        else
        {
            printf("INVALID\n");
        }
    }
    else
    {
        printf("INVALID\n");
    }
}
