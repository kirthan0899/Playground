#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int a=1, b=2;
  for(int i=1;i<=n;i++)
  {
	if(i%2!=0)
    {
      cout<<pow(i,2)-a<<" ";
    }
    else
    {
      cout<<pow(i,2)-b<<" ";
    }
  }
}