#include<iostream>
#include<cmath>
using namespace std;

int main()
{
int n,i=0;
  cin>>n;
  int a=11;
  while(i<n)
  {
	cout<<pow(a,2)<<" ";
    a=a+4;
    i++;
  }
}