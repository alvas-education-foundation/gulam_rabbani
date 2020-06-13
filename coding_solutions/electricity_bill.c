#include<stdio.h>
int main()
{ 
	int unit;
	float amt;
	printf("Enter total units consumed:");
	scanf("%d",&unit);
	if(unit<=100) 
	{ 
		amt=unit*10; 
	} 
	else if(unit<=200)
	{ 
		amt=(100*10)+(unit-100)*15; 
	} 
	else if(unit<=300)
	{ 
		amt=(100*10)+(100*15)+(unit-200)*20; 
	} 
	else if(unit>300) 
	{ 
		amt=(100*10)+(100*15)+(100*20)+(unit-300)*25; 
	} 
        printf("Electricity Bill=Rs. %.2f",amt);
	return 0; 
} 
