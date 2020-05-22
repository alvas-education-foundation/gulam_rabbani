#include<stdlib.h>

int cmpfun (const void * a, const void * b)
{

	return ( (int)a - (int)b );
}

void main()
{
	int t;
	scanf("%d",&t);
	while(t>=0)
	{
		int n;
		scanf("%d",&n);
		int arr[n];

		for(int i=0;i<n;i++)
		{
			scanf("%d",&arr[i]);
		}

		qsort(arr,n,sizeof(int),cmpfun);

		int ptr1;
		int ptr2;
		int count=0;

		for(int i=n-1;i>=0;i--)
		{
			ptr1=0;
			ptr2=i-1;

			while(ptr1<ptr2)
			{
			
				if(arr[ptr1]+arr[ptr2]>arr[i])
				{
					ptr2--;
				}
				else if(arr[ptr1]+arr[ptr2]<arr[i])
				{
					ptr1++;
				}
				else
				{
					count++;
					ptr1++;
					ptr2--;
				}
			}
		}

		if(count)
		{
			printf("%d\n",count);
		}
		else
		{
			printf("%d\n",-1);
		}
	}
}
