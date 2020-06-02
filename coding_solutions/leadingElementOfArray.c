#include <stdio.h>
int main()
{
    int i,elem,arr[100],max[100],j=0;
    printf("Enter the number of elements in array:");
    scanf("%d",&elem);
    printf("Enter the array elements:");
    for(i=0; i<elem; i++)
    {
        scanf("%d",&arr[i]);
        max[i]=0;
    }
    max[j++] = arr[elem-1];
    for(i=elem-1; i>=0; i=i-1)
        if( arr[i] >= max[j-1] )
        {
            max[j] = arr[i];
            j++;
        }
        printf("The leader in the array are:");
    for(j=j-1; j>0; j=j-1)
        printf("%d\n",max[j]);
    return 0;
}

