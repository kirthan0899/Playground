#include<iostream>
using namespace std;

int main()
{
  int a,b,sum;
  cin>>a>>b;
  for(int i=a;i<=b;i++)
  {
    sum=0;
    for(int j=1;j<i;j++)
    {
      if(i%j==0)
      {
        sum=sum+j;
      }
    }
    if(sum==i)
      cout<<i<<" ";
  }
}