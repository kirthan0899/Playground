#include<iostream>
using namespace std;

int main()
{
int n,i=1;
  cin>>n;
  int a=5, b=6;
  while(i<=n)
  {
	cout<<b<<" ";
    b=b+(a*i);
    i++;
  }
}