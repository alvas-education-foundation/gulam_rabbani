#include <bits/stdc++.h>
using namespace std;
#define max 1000000007

long long int magicNo(int n)
{
	long long int pro=1;
	long long answer=0;
	while(n)
  {
		pro=(pro*5)%max; //pow(5,i)
		if(n&1) //current LSB 1
			answer=(answer+pro)%max;
		n=n>>1; //right shift by 1 bit
	} 
	return answer;
}
int main()
{
	int n;
  cout<<"Enter N:\n";
	scanf("%d",&n);
	cout<<n<<" th magic no is: ";
	cout<<magicNo(n)<<endl;
  return 0;
}
