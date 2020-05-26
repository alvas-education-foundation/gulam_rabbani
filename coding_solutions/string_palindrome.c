Write a C program for following  
Input:Enter the Input String: abcd
Expected Result:The permutations of the string are :
abcd abdc acbd acdb adcb adbc bacd badc bcad bcda bdca bdac cbad cbda cabd cadb cdab cdba dbca dbac dcba dcab dacb dabc

#include <stdio.h> 
#include <string.h> 
void swap(char *x, char *y) 
{ 
	char temp; 
	temp = *x; 
	*x = *y; 
	*y = temp; 
} 
void permute(char *a, int l, int r) 
{ 
int i; 
if (l == r) 
	printf("%s\n", a); 
else
{ 
	for (i = l; i <= r; i++) 
	{ 
		swap((a+l), (a+i)); 
		permute(a, l+1, r); 
		swap((a+l), (a+i)); 
	} 
} 
} 
int main() 
{ 
	char str[] = "ABCD"; 
	int n = strlen(str); 
	permute(str, 0, n-1); 
	return 0; 
}
