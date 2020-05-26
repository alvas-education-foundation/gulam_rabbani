//1.Write a C Program to generate first N Triangular Numbers (Where N is Read from the Key board).
#include <stdio.h>
#include<stdlib.h>
void main()
{
    int n,i,num=0;
    printf("Enter a number:\n");
    scanf("%d",&n);
    for(i=1;i<=n;i++)
    {
        if(num==n)
        {
            exit(0);
        }
        else
        {
            num=num+i;
            printf("%d\t",num);
        }
    }
}
